package com.github.ivansjr.feignspotify.model.album;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;
import java.util.Map;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class TrackItem {
    private List<Artist> artists;
    private List<String> availableMarkets;
    private int discNumber;
    private int durationMs;
    private boolean explicit;
    private Map<String, String> externalUrls;
    private String href;
    private String id;
    private boolean isPlayable;
    private LinkedFrom linkedFrom;
    private Restriction restrictions;
    private String name;
    private String previewUrl;
    private int trackNumber;
    private String type;
    private String uri;
    private boolean isLocal;

    public TrackItem() {
    }

    public TrackItem(List<Artist> artists, List<String> availableMarkets, int discNumber, int durationMs, boolean explicit, Map<String, String> externalUrls, String href, String id, boolean isPlayable, LinkedFrom linkedFrom, Restriction restrictions, String name, String previewUrl, int trackNumber, String type, String uri, boolean isLocal) {
        this.artists = artists;
        this.availableMarkets = availableMarkets;
        this.discNumber = discNumber;
        this.durationMs = durationMs;
        this.explicit = explicit;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.isPlayable = isPlayable;
        this.linkedFrom = linkedFrom;
        this.restrictions = restrictions;
        this.name = name;
        this.previewUrl = previewUrl;
        this.trackNumber = trackNumber;
        this.type = type;
        this.uri = uri;
        this.isLocal = isLocal;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }

    public List<String> getAvailableMarkets() {
        return availableMarkets;
    }

    public void setAvailableMarkets(List<String> availableMarkets) {
        this.availableMarkets = availableMarkets;
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public void setDiscNumber(int discNumber) {
        this.discNumber = discNumber;
    }

    public int getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(int durationMs) {
        this.durationMs = durationMs;
    }

    public boolean isExplicit() {
        return explicit;
    }

    public void setExplicit(boolean explicit) {
        this.explicit = explicit;
    }

    public Map<String, String> getExternalUrls() {
        return externalUrls;
    }

    public void setExternalUrls(Map<String, String> externalUrls) {
        this.externalUrls = externalUrls;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isPlayable() {
        return isPlayable;
    }

    public void setPlayable(boolean playable) {
        isPlayable = playable;
    }

    public LinkedFrom getLinkedFrom() {
        return linkedFrom;
    }

    public void setLinkedFrom(LinkedFrom linkedFrom) {
        this.linkedFrom = linkedFrom;
    }

    public Restriction getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(Restriction restrictions) {
        this.restrictions = restrictions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean local) {
        isLocal = local;
    }
}
