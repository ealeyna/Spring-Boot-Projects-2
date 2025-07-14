package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.DtoAccount;
import com.eylulaleynasahin.dto.DtoAccountIU;

public interface IAccountService {

	public DtoAccount saveAccount(DtoAccountIU dtoAccountIU);
}
