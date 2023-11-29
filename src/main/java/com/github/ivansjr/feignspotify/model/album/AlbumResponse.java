package com.github.ivansjr.feignspotify.model.album;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
import java.util.Map;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class AlbumResponse {
    private String albumType;
    private int totalTracks;
    private List<String> availableMarkets;
    private Map<String, String> externalUrls;
    private String href;
    private String id;
    private List<Image> images;
    private String name;
    private String releaseDate;
    private String releaseDatePrecision;
    private Restriction restrictions;
    private String type;
    private String uri;
    private List<Artist> artists;
    private Tracks tracks;
    private List<Copyright> copyrights;
    private Map<String, String> externalIds;
    private List<String> genres;
    private String label;
    private int popularity;
}
