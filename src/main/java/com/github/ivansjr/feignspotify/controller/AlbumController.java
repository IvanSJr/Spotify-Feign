package com.github.ivansjr.feignspotify.controller;

import com.github.ivansjr.feignspotify.client.AlbumSpotifyClient;
import com.github.ivansjr.feignspotify.client.AuthSpotifyClient;
import com.github.ivansjr.feignspotify.dto.LoginRequestDTO;
import com.github.ivansjr.feignspotify.model.album.AlbumResponse;
import com.github.ivansjr.feignspotify.model.new_releases.AlbumReleasesResponse;
import com.github.ivansjr.feignspotify.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spotify/api/albums")
public class AlbumController {

    private final AlbumSpotifyClient albumSpotifyClient;
    private final AuthSpotifyClient authSpotifyClient;
    private final AuthService authService;

    public AlbumController(AlbumSpotifyClient albumSpotifyClient, AuthSpotifyClient authSpotifyClient, AuthService authService) {
        this.albumSpotifyClient = albumSpotifyClient;
        this.authSpotifyClient = authSpotifyClient;
        this.authService = authService;
    }

    @GetMapping("/album")
    public ResponseEntity<AlbumResponse> getById(@RequestParam(name = "id") String id) {
        LoginRequestDTO loginRequestDTO = authService.createLoginRequestDTO();
        String token = authSpotifyClient.login(loginRequestDTO).getAccessToken();
        return ResponseEntity.ok().body(albumSpotifyClient.getAlbumById("Bearer " + token, id));
    }

    @GetMapping("/releases")
    public ResponseEntity<AlbumReleasesResponse> getReleases() {
        LoginRequestDTO loginRequestDTO = authService.createLoginRequestDTO();
        String token = authSpotifyClient.login(loginRequestDTO).getAccessToken();
        return ResponseEntity.ok().body(albumSpotifyClient.getAllNewReleases("Bearer " + token));
    }

}
