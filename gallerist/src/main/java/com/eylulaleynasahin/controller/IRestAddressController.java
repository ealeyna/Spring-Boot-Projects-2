package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoAddress;
import com.eylulaleynasahin.dto.DtoAddressIU;

public interface IRestAddressController {

	public RootEntity<DtoAddress> saveAddress(DtoAddressIU dtoAddressIU);
}
