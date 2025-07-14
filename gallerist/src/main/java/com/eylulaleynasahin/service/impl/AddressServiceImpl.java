package com.eylulaleynasahin.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.dto.DtoAddress;
import com.eylulaleynasahin.dto.DtoAddressIU;
import com.eylulaleynasahin.model.Address;
import com.eylulaleynasahin.repository.AddressRepository;
import com.eylulaleynasahin.service.IAddressService;

@Service
public class AddressServiceImpl implements IAddressService{
	
	@Autowired
	private AddressRepository addressRepository;

	private Address createAddress(DtoAddressIU dtoAddressIU) {
		Address address = new Address();
		address.setCreateTime(new Date());
		
		BeanUtils.copyProperties(dtoAddressIU, address);
		return address;
	}
	
	@Override
	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU) {
		DtoAddress dtoAddress = new DtoAddress();
		
		Address savedAddress = addressRepository.save(createAddress(dtoAddressIU));
		BeanUtils.copyProperties(savedAddress, dtoAddress);
		return dtoAddress;
	}
}
