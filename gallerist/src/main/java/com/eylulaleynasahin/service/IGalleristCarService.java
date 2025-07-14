package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.DtoGalleristCar;
import com.eylulaleynasahin.dto.DtoGalleristCarIU;

public interface IGalleristCarService {

	public DtoGalleristCar saveGalleristCar(DtoGalleristCarIU dtoGalleristCarIU);
}
