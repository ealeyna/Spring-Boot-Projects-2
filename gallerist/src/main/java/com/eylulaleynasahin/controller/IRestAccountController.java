package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.DtoAccount;
import com.eylulaleynasahin.dto.DtoAccountIU;

public interface IRestAccountController {
	
	public RootEntity<DtoAccount> saveAccount(DtoAccountIU dtoAccountIU);
}
