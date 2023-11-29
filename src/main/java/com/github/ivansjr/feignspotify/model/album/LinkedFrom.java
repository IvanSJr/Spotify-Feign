package com.github.ivansjr.feignspotify.model.album;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.Map;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class LinkedFrom {
    private Map<String, String> externalUrls;
    private String href;
    private String id;
    private String type;
    private String uri;

    public LinkedFrom() {
    }

    public LinkedFrom(Map<String, String> externalUrls, String href, String id, String type, String uri) {
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.type = type;
        this.uri = uri;
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
}
