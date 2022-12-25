package com.cyrin.payload.request;

import javax.validation.constraints.NotBlank;

public class BlackListIPRequest {

    @NotBlank
    private String ip;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}