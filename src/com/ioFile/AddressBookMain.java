package com.ioFile;

public class AddressBookMain
{
    public static void main(String[] args){

     AddressBook AddBook=new AddressBook();

        System.out.println("Reading all contacts from the file: ");
        AddBook.ReadContact();
        AddBook.printAllContacts();

        System.out.println("\nContacts after adding: ");

        // Adding 3 more contact to list
        AddBook.addingContact();
        AddBook.printAllContacts2();

        System.out.println("\nContacts in file: ");
        // Writing all contacts to file
        AddBook.writeAllContactsToFile();
        AddBook.printAllContacts3();

    }
}