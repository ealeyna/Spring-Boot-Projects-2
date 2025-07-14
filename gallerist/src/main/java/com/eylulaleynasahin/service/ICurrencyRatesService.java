package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.CurrencyRatesResponse;

public interface ICurrencyRatesService {

	public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate);
}

