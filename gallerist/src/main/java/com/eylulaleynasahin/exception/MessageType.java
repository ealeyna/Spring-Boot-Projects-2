package com.eylulaleynasahin.exception;

import lombok.Getter;

@Getter
public enum MessageType {
	
	NO_RECORD_EXIST("1004", "No record found"),
	TOKEN_IS_EXPIRED("1005", "Token has expired"),
	USERNAME_NOT_FOUND("1006", "Username not found"),
	USERNAME_OR_PASSWORD_INVALID("1007", "Username or password is incorrect"),
	REFRESH_TOKEN_NOT_FOUND("1008", "Refresh token not found"),
	REFRESH_TOKEN_IS_EXPIRED("1009", "Refresh token has expired"),
	CURRENCY_RATES_IS_OCCURED("1010", "Currency rate could not be obtained"),
	CUSTOMER_AMOUNT_IS_NOT_ENOUGH("1011", "Customer's money is not enough"),
	CAR_STATUS_IS_ALREADY_SALED("1012", "Car is already saled"),
	GENERAL_EXCEPTION("9999", "A general error occurred");
	
	private String code;
	private String message;
	
	MessageType(String code, String message) {
		this.code = code;
		this.message = message;
	}
}

