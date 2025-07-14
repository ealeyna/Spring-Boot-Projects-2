package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.DtoGallerist;
import com.eylulaleynasahin.dto.DtoGalleristIU;

public interface IGalleristService {

	public DtoGallerist saveGallerist(DtoGalleristIU dtoGalleristIU);
}
