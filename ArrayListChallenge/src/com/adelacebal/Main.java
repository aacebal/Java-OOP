package com.adelacebal;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("555 444 3322");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while(!quit) {
            System.out.println("\nEnter action:");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nSutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone() { System.out.println("Starting phone... "); }

    private static void addContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);
        if (mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: " +
                    name + " - " + phoneNumber);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (mobilePhone.updateContact(existingContact, newContact)) {
            System.out.println("Succesfully updated record");
        } else {
            System.out.println("Error updating record");
        }

    }

    private static void printActions() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - shutdown\n" +
                           "1 - print contacts\n" +
                           "3 - update an existing contact\n" +
                           "4 - remove an existing contact\n" +
                           "5 - query if an existing contact exists\n" +
                           "6 - print a list of available actions");
        System.out.println("Choose your actions");
    }
}
