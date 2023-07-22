package com.identityreconcilliation.daos;

import com.identityreconcilliation.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContactDAO {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactDAO(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }
}
