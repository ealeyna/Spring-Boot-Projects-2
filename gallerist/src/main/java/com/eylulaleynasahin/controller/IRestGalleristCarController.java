package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoGalleristCar;
import com.eylulaleynasahin.dto.DtoGalleristCarIU;

public interface IRestGalleristCarController {

	public RootEntity<DtoGalleristCar> saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
