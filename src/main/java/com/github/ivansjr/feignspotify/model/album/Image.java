package com.github.ivansjr.feignspotify.model.album;

public class Image {
    private String url;
    private Integer height;
    private Integer width;

    public Image() {
    }

    public Image(String url, int height, int width) {
        this.url = url;
        this.height = height;
        this.width = width;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
