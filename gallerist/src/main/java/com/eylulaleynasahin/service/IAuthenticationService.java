package com.eylulaleynasahin.service;

import com.eylulaleynasahin.dto.AuthRequest;
import com.eylulaleynasahin.dto.AuthResponse;
import com.eylulaleynasahin.dto.DtoUser;
import com.eylulaleynasahin.dto.RefreshTokenRequest;

public interface IAuthenticationService {

	public DtoUser register(AuthRequest input);
	
	public AuthResponse authenticate(AuthRequest input);
	
	public AuthResponse refreshToken(RefreshTokenRequest input);
}
