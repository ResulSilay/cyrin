package com.cyrin.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EmailBreach {

    @JsonProperty("email")
    private String email;

    public EmailBreach(String email) {
        this.email = email;
    }
}
