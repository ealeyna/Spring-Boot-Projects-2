package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.DtoCar;
import com.eylulaleynasahin.dto.DtoCarIU;

public interface ICarService {

	public DtoCar saveCar(DtoCarIU dtoCarIU);
}
