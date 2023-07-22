package com.identityreconcilliation.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentifyRequest {
    private final String email;
    private final String phoneNumber;
}
