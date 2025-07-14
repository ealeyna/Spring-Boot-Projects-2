package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoGallerist;
import com.eylulaleynasahin.dto.DtoGalleristIU;

public interface IRestGalleristController {

	public RootEntity<DtoGallerist> saveGallerist(DtoGalleristIU dtoGalleristIU);
}


