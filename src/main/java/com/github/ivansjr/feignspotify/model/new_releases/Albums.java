package com.github.ivansjr.feignspotify.model.new_releases;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.util.List;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Albums {
    private String href;
    private List<AlbumItem> items;

    public Albums() {
    }

    public Albums(String href, List<AlbumItem> items) {
        this.href = href;
        this.items = items;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public List<AlbumItem> getItems() {
        return items;
    }

    public void setItems(List<AlbumItem> items) {
        this.items = items;
    }
}
