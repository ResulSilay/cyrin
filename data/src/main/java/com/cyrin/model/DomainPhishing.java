package com.cyrin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DomainPhishing {

    @JsonProperty("domain")
    private String domain;

    public DomainPhishing(String domain) {
        this.domain = domain;
    }
}
