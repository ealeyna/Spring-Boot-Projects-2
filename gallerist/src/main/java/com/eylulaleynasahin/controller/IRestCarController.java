package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoCar;
import com.eylulaleynasahin.dto.DtoCarIU;

public interface IRestCarController {

	public RootEntity<DtoCar> saveCar(DtoCarIU dtoCarIU);
}

