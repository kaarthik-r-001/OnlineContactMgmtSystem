package com.signify.casestudy.services;

import com.signify.casestudy.entity.Contact;
import com.signify.casestudy.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.Optional;

@Service
public class ContactServiceImpl  implements ContactService{
    @Autowired
    private ContactRepository contactRepository;
    private final Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);

    @Override
    public Contact addContact(Contact contact) {
        logger.info("Adding contact: "+ contact.getName());
        Contact addedContact = contactRepository.save(contact);
        logger.info("Contact added successfully with ID: "+ (addedContact.getUserId()));
        return addedContact;
    }

    @Override
    public Contact getContactById(Integer userId) {
        logger.info("Fetching contact details for ID: " + userId.toString());
        return contactRepository.findById(userId).get();
    }

    @Override
    public Contact updateContact(Integer userId, Contact contact) {
        Contact deptDB=contactRepository.findById(userId).get();
        if(Objects.nonNull(contact.getName()) && !"".equalsIgnoreCase(contact.getName())){
            deptDB.setName(contact.getName());

        }
        if(Objects.nonNull(contact.getPhoneNum()) && !"".equalsIgnoreCase(contact.getPhoneNum().toString())){
            deptDB.setPhoneNum(contact.getPhoneNum());

        }
        if(Objects.nonNull(contact.getEmail()) && !"".equalsIgnoreCase(contact.getEmail())){
            deptDB.setEmail(contact.getEmail());

        }
        logger.info("Contact details updated successfully");
        return contactRepository.save(deptDB);
    }

    @Override
    public void deleteContactById(Integer userId) {
        logger.info("Deleting contact with ID: "+ userId.toString());
        contactRepository.deleteById(userId);
        logger.info("Contact deleted successfully");
    }

}
