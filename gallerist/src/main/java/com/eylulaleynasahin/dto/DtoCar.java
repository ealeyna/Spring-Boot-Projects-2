package com.eylulaleynasahin.dto;

import java.math.BigDecimal;

import com.eylulaleynasahin.enums.CarStatusType;
import com.eylulaleynasahin.enums.CurrencyType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DtoCar extends DtoBase{

	private String plate;

	private String brand;

	private String model;
	
	private Integer productionYear;
	
	private BigDecimal price;
	
	private CurrencyType currencyType;
	
	private BigDecimal damagePrice;
	
	private CarStatusType carStatusType;
}












