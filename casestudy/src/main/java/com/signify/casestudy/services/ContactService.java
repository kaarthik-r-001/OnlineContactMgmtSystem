package com.signify.casestudy.services;

import com.signify.casestudy.entity.Contact;

public interface ContactService {
    public Contact addContact(Contact contact);

    public Contact getContactById(Integer userId);

    public Contact updateContact(Integer userId, Contact contact);

    void deleteContactById(Integer userId);
}
