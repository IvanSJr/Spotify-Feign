package com.github.ivansjr.feignspotify.model.new_releases;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.github.ivansjr.feignspotify.model.album.Artist;
import com.github.ivansjr.feignspotify.model.album.Image;

import java.util.List;
import java.util.Map;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumItem {
    private String id;
    private String name;
    private String releaseDate;
    private Integer totalTracks;
    private String href;
    private String uri;
    private List<Artist> artists;
    private Map<String, String> externalUrls;
    private List<Image> images;

    public AlbumItem() {
    }

    public AlbumItem(String id, String name, String releaseDate, Integer totalTracks, String href, String uri,
                     List<Artist> artists, Map<String, String> externalUrls,
                     List<Image> images) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.totalTracks = totalTracks;
        this.href = href;
        this.uri = uri;
        this.artists = artists;
        this.externalUrls = externalUrls;
        this.images = images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getTotalTracks() {
        return totalTracks;
    }

    public void setTotalTracks(Integer totalTracks) {
        this.totalTracks = totalTracks;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public Map<String, String> getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(Map<String, String> externalUrls) {
        this.externalUrls = externalUrls;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
