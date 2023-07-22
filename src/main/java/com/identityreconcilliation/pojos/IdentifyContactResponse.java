package com.identityreconcilliation.pojos;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class IdentifyContactResponse {
    private final Integer primaryContactId;
    private final List<String> emails;
    private final List<String> phoneNumbers;
    private final List<Integer> secondaryContactIds;
}
