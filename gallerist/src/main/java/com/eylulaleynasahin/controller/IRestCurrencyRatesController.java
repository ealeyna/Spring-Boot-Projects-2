package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.CurrencyRatesResponse;

public interface IRestCurrencyRatesController {

	public RootEntity<CurrencyRatesResponse> getCurrencyRates(String startDate, String endDate);
}

