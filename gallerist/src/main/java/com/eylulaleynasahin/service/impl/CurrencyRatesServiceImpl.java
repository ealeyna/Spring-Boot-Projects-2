package com.eylulaleynasahin.service.impl;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.eylulaleynasahin.dto.CurrencyRatesResponse;
import com.eylulaleynasahin.exception.BaseException;
import com.eylulaleynasahin.exception.ErrorMessage;
import com.eylulaleynasahin.exception.MessageType;
import com.eylulaleynasahin.service.ICurrencyRatesService;

@Service
public class CurrencyRatesServiceImpl implements ICurrencyRatesService{

	@Override
	public CurrencyRatesResponse getCurrencyRates(String startDate, String endDate) {
		//https://evds2.tcmb.gov.tr/service/evds/series=TP.DK.USD.A&startDate=04-07-2025&endDate=04-07-2025&type=json

		String rootUrl = "https://evds2.tcmb.gov.tr/service/evds/";
		String series = "TP.DK.USD.A";
		String type = "json";
		
		String endPoint = rootUrl + "series=" + series + "&startDate=" + startDate + "&endDate=" + endDate + "&type=" + type;
		
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.set("key", "XsBxAxzaVo");
		HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders); 
		
		try {
			RestTemplate restTemplate = new RestTemplate();

			ResponseEntity<CurrencyRatesResponse> response = restTemplate.exchange(endPoint, HttpMethod.GET, httpEntity, 
					new ParameterizedTypeReference<CurrencyRatesResponse>() {
					});
			if(response.getStatusCode().is2xxSuccessful()) {
				return response.getBody();
			}
		}catch (Exception e) {
			// TODO: handle exception
			throw new BaseException(new ErrorMessage(MessageType.CURRENCY_RATES_IS_OCCURED, e.getMessage()));
		}
		
		return null;
	}
}
