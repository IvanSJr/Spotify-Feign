package com.github.ivansjr.feignspotify.model.new_releases;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumReleasesResponse {
    private Albums albums;

    public AlbumReleasesResponse() {
    }

    public AlbumReleasesResponse(Albums albums) {
        this.albums = albums;
    }

    public Albums getAlbums() {
        return albums;
    }

    public void setAlbums(Albums albums) {
        this.albums = albums;
    }
}
