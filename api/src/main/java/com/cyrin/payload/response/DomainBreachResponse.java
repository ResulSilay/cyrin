package com.cyrin.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class DomainBreachResponse {

    @JsonProperty("results")
    public BreachDomainResult results;

    @JsonProperty("status")
    public String status;
}

class BreachDomainList {
    @JsonProperty("Email")
    public String email;

    @JsonProperty("LeakTime")
    public String leakTime;

    @JsonProperty("Tags")
    public String tags;
}

class BreachDomainResult {
    @JsonProperty("breachList")
    public ArrayList<BreachDomainList> breachList;
    @JsonProperty("breachSize")
    public int breachSize;
}