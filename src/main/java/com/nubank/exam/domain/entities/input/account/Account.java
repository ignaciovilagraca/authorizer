package com.nubank.exam.domain.entities.input.account;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Account {
    @JsonProperty("active-card")
    private Boolean activeCard;

    @JsonProperty("available-limit")
    private Long availableLimit;
}

