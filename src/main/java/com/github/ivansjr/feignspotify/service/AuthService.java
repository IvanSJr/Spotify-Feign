package com.github.ivansjr.feignspotify.service;

import com.github.ivansjr.feignspotify.dto.LoginRequestDTO;
import org.springframework.beans.factory.annotation.Value;

public class AuthService {
    @Value("${auth.client-id}")
    private String clientId;

    @Value("${auth.client-secret}")
    private String clientSecret;

    public LoginRequestDTO createLoginRequestDTO() {
        return new LoginRequestDTO("client_credentials", clientId, clientSecret);
    }
}
