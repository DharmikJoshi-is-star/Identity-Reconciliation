package com.identityreconcilliation.entities;


import com.identityreconcilliation.enums.LinkPrecedenceType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.Instant;

@Data
@Builder
@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Integer id;
    private final String phoneNumber;
    private final String email;
    private final Integer linkedId;
    private final LinkPrecedenceType linkPrecedence;
    @CreatedDate
    private final Instant createdAt;
    @LastModifiedDate
    private final Instant updatedAt;
    private final Instant deletedAt;
}
