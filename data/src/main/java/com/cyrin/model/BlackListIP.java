package com.cyrin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BlackListIP {

    @JsonProperty("ip")
    private String ip;

    public BlackListIP(String ip) {
        this.ip = ip;
    }
}
