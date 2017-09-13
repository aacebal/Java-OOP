package com.adelacebal;

import java.util.ArrayList;

public class MobilePhone {

    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void modifyContact(String oldContactName, Contact newContact) {
        int oldContactIndex = findContact(oldContactName);
        contacts.set(oldContactIndex, newContact);
    }

    public void removeContact(String nameToRemove) {
        int indexToRemove = findContact(nameToRemove);
        contacts.remove(indexToRemove);
    }

    private int findContact(String nameToFind) {
        int indexOfInfo = contacts.indexOf(nameToFind);

        if (indexOfInfo >= 0) {
            return indexOfInfo;
        }
        return -1;
    }

}
