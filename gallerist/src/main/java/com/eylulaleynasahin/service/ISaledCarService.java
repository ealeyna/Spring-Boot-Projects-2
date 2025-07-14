package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.DtoSaledCar;
import com.eylulaleynasahin.dto.DtoSaledCarIU;

public interface ISaledCarService {

	public DtoSaledCar buyCar(DtoSaledCarIU dtoSaledCarIU);
}


