package com.adelacebal;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int oldContactIndex = findContact(oldContact);
        if (oldContactIndex < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContacts.set(oldContactIndex, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public void removeContact(String nameToRemove) {
        int indexToRemove = findContact(nameToRemove);
        myContacts.remove(indexToRemove);
    }

    private int findContact(Contact contact) {
        int indexOfInfo = myContacts.indexOf(contact);

        if (indexOfInfo >= 0) {
            return indexOfInfo;
        }
        return -1;
    }

    private int findContact(String contactName) {
        for (int i=0; i<this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

}
