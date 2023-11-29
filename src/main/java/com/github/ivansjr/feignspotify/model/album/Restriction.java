package com.github.ivansjr.feignspotify.model.album;

public class Restriction {
    private String reason;

    public Restriction() {
    }

    public Restriction(String reason) {
        this.reason = reason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
