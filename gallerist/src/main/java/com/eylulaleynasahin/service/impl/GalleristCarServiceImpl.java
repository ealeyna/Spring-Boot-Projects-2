package com.eylulaleynasahin.service.impl;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eylulaleynasahin.dto.DtoAddress;
import com.eylulaleynasahin.dto.DtoCar;
import com.eylulaleynasahin.dto.DtoGallerist;
import com.eylulaleynasahin.dto.DtoGalleristCar;
import com.eylulaleynasahin.dto.DtoGalleristCarIU;
import com.eylulaleynasahin.exception.BaseException;
import com.eylulaleynasahin.exception.ErrorMessage;
import com.eylulaleynasahin.exception.MessageType;
import com.eylulaleynasahin.model.Car;
import com.eylulaleynasahin.model.Gallerist;
import com.eylulaleynasahin.model.GalleristCar;
import com.eylulaleynasahin.repository.CarRepository;
import com.eylulaleynasahin.repository.GalleristCarRepository;
import com.eylulaleynasahin.repository.GalleristRepository;
import com.eylulaleynasahin.service.IGalleristCarService;

@Service
public class GalleristCarServiceImpl implements IGalleristCarService{
	
	@Autowired
	private GalleristCarRepository galleristCarRepository;
	
	@Autowired
	private GalleristRepository galleristRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	private GalleristCar createGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
		
		Optional<Gallerist> optGallerist = galleristRepository.findById(dtoGalleristCarIU.getGalleristId());
		if(optGallerist.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCarIU.getGalleristId().toString()));
		}
		
		Optional<Car> optCar = carRepository.findById(dtoGalleristCarIU.getCarId());
		if(optCar.isEmpty()) {
			throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, dtoGalleristCarIU.getCarId().toString()));
		}
				
		GalleristCar galleristCar = new GalleristCar();
		galleristCar.setCreateTime(new Date());
		galleristCar.setGallerist(optGallerist.get());
		galleristCar.setCar(optCar.get());
		
		return galleristCar;
	}

	@Override
	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU) {
		DtoGalleristCar dtoGalleristCar = new DtoGalleristCar();
		DtoGallerist dtoGallerist = new DtoGallerist();
		DtoAddress dtoAddress = new DtoAddress();
		DtoCar dtoCar = new DtoCar();
		
		GalleristCar savedGalleristCar = galleristCarRepository.save(createGalleristCar(dtoGalleristCarIU));
		BeanUtils.copyProperties(savedGalleristCar, dtoGalleristCar);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist(), dtoGallerist);
		BeanUtils.copyProperties(savedGalleristCar.getGallerist().getAddress(), dtoAddress);
		BeanUtils.copyProperties(savedGalleristCar.getCar(), dtoCar);
		
		dtoGallerist.setAddress(dtoAddress);
		dtoGalleristCar.setGallerist(dtoGallerist);
		dtoGalleristCar.setCar(dtoCar);

		return dtoGalleristCar;
	}
}
