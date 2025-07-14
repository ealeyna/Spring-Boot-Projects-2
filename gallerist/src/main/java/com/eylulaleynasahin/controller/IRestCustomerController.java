package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoCustomer;
import com.eylulaleynasahin.dto.DtoCustomerIU;

public interface IRestCustomerController {
	
	public RootEntity<DtoCustomer> saveCustomer(DtoCustomerIU dtoCustomerIU);
}
