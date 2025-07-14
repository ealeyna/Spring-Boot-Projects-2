package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.DtoAddress;
import com.eylulaleynasahin.dto.DtoAddressIU;

public interface IAddressService {

	public DtoAddress saveAddress(DtoAddressIU dtoAddressIU);
}

