package com.github.ivansjr.feignspotify.controller;

import com.github.ivansjr.feignspotify.client.AuthSpotifyClient;
import com.github.ivansjr.feignspotify.dto.LoginRequestDTO;
import com.github.ivansjr.feignspotify.model.album.LoginResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api/login")
public class LoginController {

    private final AuthSpotifyClient authSpotifyClient;

    public LoginController(AuthSpotifyClient authSpotifyClient) {
        this.authSpotifyClient = authSpotifyClient;
    }

    @PostMapping
    public ResponseEntity<LoginResponse> login() {
        LoginRequestDTO loginRequestDTO = new LoginRequestDTO(
                "client_credentials",
                "03752b1a656a454b9e76e11d78936ca8",
                "c1f60478e52b4d5983790998f66c9c66"
        );
        return ResponseEntity.ok().body(authSpotifyClient.login(loginRequestDTO));
    }

}
