package com.cyrin.payload.request;

import javax.validation.constraints.NotBlank;

public class DomainPhishingRequest {

    @NotBlank
    private String domain;

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}