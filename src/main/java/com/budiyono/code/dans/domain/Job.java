package com.budiyono.code.dans.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Job {
    private String id;
    private String type;
    private String url;
    @JsonProperty("created_at")
    private String createdAt;
    private String company;
    @JsonProperty("company_url")
    private String companyUrl;
    private String location;
    private String title;
    private String description;
    @JsonProperty("how_to_apply")
    private String howToApply;
    @JsonProperty("company_logo")
    private String companyLogo;

}
