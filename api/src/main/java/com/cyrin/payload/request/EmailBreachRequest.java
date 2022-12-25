package com.cyrin.payload.request;

import javax.validation.constraints.NotBlank;

public class EmailBreachRequest {
    @NotBlank
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}