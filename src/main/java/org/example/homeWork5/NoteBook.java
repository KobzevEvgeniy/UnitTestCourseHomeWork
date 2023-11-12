package org.example.homeWork5;

import java.util.ArrayList;
import java.util.List;

public class NoteBook {

    public List<Contact> contacts = new ArrayList<>();


    public void addContact(Contact contact) {

        contacts.add(contact);
    }
    public List<Contact> getContacts() {
        return contacts;
    }

    public String toString(Contact contact) {
        return (contact.getFirstName()+" "+
                contact.getLastName()+" "+
                contact.getPhone()).toString(); }

    public Contact getContact(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
    }
    public boolean removeContact(String firstName, String lastName) {
        Contact contact = getContact(firstName, lastName);
        if (contact != null) {
            contacts.remove(contact);
            return true;
        } else { return false; }
    }
    public boolean updateContact(String firstName, String lastName, String phone) {
        Contact contactToUpdate = getContact(firstName,lastName);
        if (contactToUpdate != null) {
            contactToUpdate.setFirstName(firstName);
            contactToUpdate.setLastName(lastName);
            contactToUpdate.setPhone(phone);
            return true;
        } else {
            return false;
        }
    }
    public void printContacts() {
        System.out.println("Contacts:");
        for (Contact contact : contacts) {
            System.out.printf("\tФамилия:  %s " +
                    " \tИмя:       %s     " +
                    "\tТелефон: %s%n",
                    contact.getFirstName(),
                    contact.getLastName(),
                    contact.getPhone());
        }
    }
}



