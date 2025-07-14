package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoSaledCar;
import com.eylulaleynasahin.dto.DtoSaledCarIU;

public interface IRestSaledCarController {
	
	public RootEntity<DtoSaledCar> buyCar(DtoSaledCarIU dtoSaledCarIU);
}
