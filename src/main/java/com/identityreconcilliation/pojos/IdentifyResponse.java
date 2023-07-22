package com.identityreconcilliation.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class IdentifyResponse {
    @JsonProperty(value = "contact")
    private final IdentifyContactResponse identifyContactResponse;
}
