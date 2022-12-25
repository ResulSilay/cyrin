package com.cyrin.payload.response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "results",
        "status"
})
@Generated("jsonschema2pojo")
public class BlackListIPResponse {

    @JsonProperty("results")
    private EmailBreachResult results;

    @JsonProperty("status")
    private String status;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("results")
    public EmailBreachResult getResults() {
        return results;
    }

    @JsonProperty("results")
    public void setResults(EmailBreachResult emailBreachResult) {
        this.results = emailBreachResult;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "Category",
        "Data",
        "Description",
        "FileSource",
        "FirstListingDate",
        "LastSeenDate",
        "LastUpdatedDate",
        "ListSourceUrl",
        "Maintainer",
        "MaintainerUrl",
        "ReputationCount",
        "UpdateFrequency"
})
@Generated("jsonschema2pojo")
class BlackListIPData {

    @JsonProperty("Category")
    private String category;

    @JsonProperty("Data")
    private String data;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("FileSource")
    private String fileSource;

    @JsonProperty("FirstListingDate")
    private String firstListingDate;

    @JsonProperty("LastSeenDate")
    private String lastSeenDate;

    @JsonProperty("LastUpdatedDate")
    private String lastUpdatedDate;

    @JsonProperty("ListSourceUrl")
    private String listSourceUrl;

    @JsonProperty("Maintainer")
    private String maintainer;

    @JsonProperty("MaintainerUrl")
    private String maintainerUrl;

    @JsonProperty("ReputationCount")
    private Integer reputationCount;

    @JsonProperty("UpdateFrequency")
    private String updateFrequency;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Category")
    public String getCategory() {
        return category;
    }

    @JsonProperty("Category")
    public void setCategory(String category) {
        this.category = category;
    }

    @JsonProperty("Data")
    public String getData() {
        return data;
    }

    @JsonProperty("Data")
    public void setData(String data) {
        this.data = data;
    }

    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("FileSource")
    public String getFileSource() {
        return fileSource;
    }

    @JsonProperty("FileSource")
    public void setFileSource(String fileSource) {
        this.fileSource = fileSource;
    }

    @JsonProperty("FirstListingDate")
    public String getFirstListingDate() {
        return firstListingDate;
    }

    @JsonProperty("FirstListingDate")
    public void setFirstListingDate(String firstListingDate) {
        this.firstListingDate = firstListingDate;
    }

    @JsonProperty("LastSeenDate")
    public String getLastSeenDate() {
        return lastSeenDate;
    }

    @JsonProperty("LastSeenDate")
    public void setLastSeenDate(String lastSeenDate) {
        this.lastSeenDate = lastSeenDate;
    }

    @JsonProperty("LastUpdatedDate")
    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    @JsonProperty("LastUpdatedDate")
    public void setLastUpdatedDate(String lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }

    @JsonProperty("ListSourceUrl")
    public String getListSourceUrl() {
        return listSourceUrl;
    }

    @JsonProperty("ListSourceUrl")
    public void setListSourceUrl(String listSourceUrl) {
        this.listSourceUrl = listSourceUrl;
    }

    @JsonProperty("Maintainer")
    public String getMaintainer() {
        return maintainer;
    }

    @JsonProperty("Maintainer")
    public void setMaintainer(String maintainer) {
        this.maintainer = maintainer;
    }

    @JsonProperty("MaintainerUrl")
    public String getMaintainerUrl() {
        return maintainerUrl;
    }

    @JsonProperty("MaintainerUrl")
    public void setMaintainerUrl(String maintainerUrl) {
        this.maintainerUrl = maintainerUrl;
    }

    @JsonProperty("ReputationCount")
    public Integer getReputationCount() {
        return reputationCount;
    }

    @JsonProperty("ReputationCount")
    public void setReputationCount(Integer reputationCount) {
        this.reputationCount = reputationCount;
    }

    @JsonProperty("UpdateFrequency")
    public String getUpdateFrequency() {
        return updateFrequency;
    }

    @JsonProperty("UpdateFrequency")
    public void setUpdateFrequency(String updateFrequency) {
        this.updateFrequency = updateFrequency;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "blacklistData",
        "blacklistSize"
})
@Generated("jsonschema2pojo")
class BlackListIPResults {

    @JsonProperty("blacklistData")
    private List<BlackListIPData> blacklistData = null;

    @JsonProperty("blacklistSize")
    private Integer blacklistSize;

    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("blacklistData")
    public List<BlackListIPData> getBlacklistData() {
        return blacklistData;
    }

    @JsonProperty("blacklistData")
    public void setBlacklistData(List<BlackListIPData> blackListIPData) {
        this.blacklistData = blackListIPData;
    }

    @JsonProperty("blacklistSize")
    public Integer getBlacklistSize() {
        return blacklistSize;
    }

    @JsonProperty("blacklistSize")
    public void setBlacklistSize(Integer blacklistSize) {
        this.blacklistSize = blacklistSize;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
