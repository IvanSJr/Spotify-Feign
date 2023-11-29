package com.github.ivansjr.feignspotify.client;

import com.github.ivansjr.feignspotify.model.album.AlbumResponse;
import com.github.ivansjr.feignspotify.model.new_releases.AlbumReleasesResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(
        name = "AlbumSpotifyClient",
        url = "https://api.spotify.com"
)
public interface AlbumSpotifyClient {

    @GetMapping("/v1/albums/{idAlbum}")
    AlbumResponse getAlbumById(@RequestHeader("Authorization") String authorization, @PathVariable String idAlbum);

    @GetMapping("/v1/browse/new-releases")
    AlbumReleasesResponse getAllNewReleases(@RequestHeader("Authorization") String authorization);
}
