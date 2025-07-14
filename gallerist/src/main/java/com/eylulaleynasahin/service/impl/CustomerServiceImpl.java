package com.eylulaleynasahin.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.dto.DtoAccount;
import com.eylulaleynasahin.dto.DtoAddress;
import com.eylulaleynasahin.dto.DtoCustomer;
import com.eylulaleynasahin.dto.DtoCustomerIU;
import com.eylulaleynasahin.exception.BaseException;
import com.eylulaleynasahin.exception.ErrorMessage;
import com.eylulaleynasahin.exception.MessageType;
import com.eylulaleynasahin.model.Account;
import com.eylulaleynasahin.model.Address;
import com.eylulaleynasahin.model.Customer;
import com.eylulaleynasahin.repository.AccountRepository;
import com.eylulaleynasahin.repository.AddressRepository;
import com.eylulaleynasahin.repository.CustomerRepository;
import com.eylulaleynasahin.service.ICustomerService;

@Service
public class CustomerServiceImpl implements ICustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private AccountRepository accountRepository;

	private Customer createCustomer(DtoCustomerIU dtoCustomerIU) {
		Optional<Address> optAddress = addressRepository.findById(dtoCustomerIU.getAddressId());
		if(optAddress.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoCustomerIU.getAddressId().toString()));
		}
		
		Optional<Account> optAccount = accountRepository.findById(dtoCustomerIU.getAccountId());
		if(optAccount.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoCustomerIU.getAccountId().toString()));
		}
		
		Customer customer = new Customer();
		customer.setCreateTime(new Date());
		
		BeanUtils.copyProperties(dtoCustomerIU, customer);
		customer.setAddress(optAddress.get());
		customer.setAccount(optAccount.get());
		return customer;
	}
	
	@Override
	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU) {
		DtoCustomer dtoCustomer = new DtoCustomer();
		DtoAddress dtoAddress = new DtoAddress();
		DtoAccount dtoAccount = new DtoAccount();
		Customer savedCustomer = customerRepository.save(createCustomer(dtoCustomerIU));
		
		BeanUtils.copyProperties(savedCustomer, dtoCustomer);
		BeanUtils.copyProperties(savedCustomer.getAddress(), dtoAddress);
		BeanUtils.copyProperties(savedCustomer.getAccount(), dtoAccount);
		dtoCustomer.setAddress(dtoAddress);
		dtoCustomer.setAccount(dtoAccount);
		return dtoCustomer;
	}
}
