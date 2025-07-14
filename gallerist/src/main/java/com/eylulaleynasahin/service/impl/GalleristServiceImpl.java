package com.eylulaleynasahin.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.dto.DtoAddress;
import com.eylulaleynasahin.dto.DtoGallerist;
import com.eylulaleynasahin.dto.DtoGalleristIU;
import com.eylulaleynasahin.exception.BaseException;
import com.eylulaleynasahin.exception.ErrorMessage;
import com.eylulaleynasahin.exception.MessageType;
import com.eylulaleynasahin.model.Address;
import com.eylulaleynasahin.model.Gallerist;
import com.eylulaleynasahin.repository.AddressRepository;
import com.eylulaleynasahin.repository.GalleristRepository;
import com.eylulaleynasahin.service.IGalleristService;

@Service
public class GalleristServiceImpl implements IGalleristService{
	
	@Autowired
	private GalleristRepository galleristRepository;

	@Autowired
	private AddressRepository addressRepository;
	
	private Gallerist createGallerist(DtoGalleristIU dtoGalleristIU) {
		Optional<Address> optAddress = addressRepository.findById(dtoGalleristIU.getAddressId());
		
		if(optAddress.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristIU.getAddressId().toString()));
		}
		
		Gallerist gallerist = new Gallerist();
		gallerist.setCreateTime(new Date());
		
		BeanUtils.copyProperties(dtoGalleristIU, gallerist);
		gallerist.setAddress(optAddress.get());
		
		return gallerist;
	}
	
	@Override
	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU) {
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoAddress dtoAddress = new DtoAddress();
		
		Gallerist savedGallerist = galleristRepository.save(createGallerist(dtoGalleristIU));
		BeanUtils.copyProperties(savedGallerist, dtoGallerist);
		BeanUtils.copyProperties(savedGallerist.getAddress(), dtoAddress);
		dtoGallerist.setAddress(dtoAddress);
		return dtoGallerist;
	}
}











