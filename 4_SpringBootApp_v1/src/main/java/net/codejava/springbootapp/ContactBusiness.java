package net.codejava.springbootapp;

import java.util.ArrayList;
import java.util.List;

public class ContactBusiness {
    public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
        listContact.add(new Contact("Name1", "Email1", "Country1"));
        listContact.add(new Contact("Name2", "Email2", "Country2"));
        listContact.add(new Contact("Name3", "Email3", "Country3"));
        listContact.add(new Contact("Name4", "Email4", "Country4"));

        return listContact;
    }
}
