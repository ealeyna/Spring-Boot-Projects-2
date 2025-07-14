package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.DtoCustomer;
import com.eylulaleynasahin.dto.DtoCustomerIU;

public interface ICustomerService {

	public DtoCustomer saveCustomer(DtoCustomerIU dtoCustomerIU);
}
