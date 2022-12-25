package com.cyrin.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class EmailBreachResponse {
    @JsonProperty("results")
    private EmailBreachResult results;

    @JsonProperty("status")
    private String status;

    public EmailBreachResult getResults() {
        return results;
    }

    public void setResults(EmailBreachResult emailBreachResult) {
        this.results = emailBreachResult;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

class EmailBreachList {
    @JsonProperty("Email")
    private String email;

    @JsonProperty("LeakTime")
    private String leakTime;

    @JsonProperty("Tags")
    private String tags;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLeakTime() {
        return leakTime;
    }

    public void setLeakTime(String leakTime) {
        this.leakTime = leakTime;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
}

class EmailBreachResult {
    @JsonProperty("breachList")
    private List<EmailBreachList> breachList = new ArrayList<>();

    @JsonProperty("breachSize")
    private Integer breachSize;

    public List<EmailBreachList> getBreachList() {
        return breachList;
    }

    public void setBreachList(List<EmailBreachList> emailBreachList) {
        this.breachList = emailBreachList;
    }

    public Integer getBreachSize() {
        return breachSize;
    }

    public void setBreachSize(Integer breachSize) {
        this.breachSize = breachSize;
    }
}