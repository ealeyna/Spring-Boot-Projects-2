package com.eylulaleynasahin.controller;

import com.eylulaleynasahin.dto.AuthRequest;
import com.eylulaleynasahin.dto.AuthResponse;
import com.eylulaleynasahin.dto.DtoUser;
import com.eylulaleynasahin.dto.RefreshTokenRequest;

public interface IRestAuthenticationController {

	public RootEntity<DtoUser> register(AuthRequest input);

	public RootEntity<AuthResponse> authentication(AuthRequest input);
	
	public RootEntity<AuthResponse> refreshToken(RefreshTokenRequest input);
}
