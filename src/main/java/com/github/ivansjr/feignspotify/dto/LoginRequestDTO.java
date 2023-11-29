package com.github.ivansjr.feignspotify.dto;

import feign.form.FormProperty;

import javax.validation.constraints.NotEmpty;

public class LoginRequestDTO {

    @NotEmpty(message = "The grant type field is required")
    @FormProperty("grant_type")
    private String grantType;

    @NotEmpty(message = "The client id field is required")
    @FormProperty("client_id")
    private String clientId;

    @NotEmpty(message = "The client secret field is required")
    @FormProperty("client_secret")
    private String clientSecret;

    public LoginRequestDTO() {
    }

    public LoginRequestDTO(String grantType, String clientId, String clientSecret) {
        this.grantType = grantType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
}
