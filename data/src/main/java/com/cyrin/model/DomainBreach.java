package com.cyrin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DomainBreach {

    @JsonProperty("domain")
    private String domain;

    public DomainBreach(String domain) {
        this.domain = domain;
    }
}
