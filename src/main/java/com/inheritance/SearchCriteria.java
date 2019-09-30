package com.inheritance;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.Builder;

@Builder
@JsonDeserialize(builder = SearchCriteria.SearchCriteriaBuilder.class)
public class SearchCriteria {
    StringParameter<String> testName;
    IntegerParameter<Integer> team;
    @JsonPOJOBuilder(withPrefix = "")
    public static class SearchCriteriaBuilder{

    }
}
