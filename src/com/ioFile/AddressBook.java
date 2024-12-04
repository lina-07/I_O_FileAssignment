package com.ioFile;

import java.io.*;
import java.util.ArrayList;

public class AddressBook {
    String file = "C:\\Users\\mk\\Desktop\\ContactFile.txt";
    ArrayList<Contact> list = new ArrayList<>();

    // Reading all the contacts from the file
    public void ReadContact()
    {
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                if (details.length == 3) {
                    Contact contact = new Contact(details[0].trim(), details[1].trim(), details[2].trim());
                    list.add(contact);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void printAllContacts()
    {
        for (Contact contact : list)
        {
            System.out.println(contact);
        }
    }
    public void addingContact()
    {
        list.add(new Contact("Anushka", "8001234644", "anu@gmail.com"));
        list.add(new Contact("Sonali", "9009876522", "sonali@gmail.com"));
        list.add(new Contact("Rani", "7007654333", "rani@gmail.com"));
    }
    public void printAllContacts2()
    {
        for (Contact contact : list)
        {
            System.out.println(contact);
        }
    }
    public void writeAllContactsToFile()
    {
        try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
            for (Contact contact : list)
            {
                br.write(contact.toString());
                br.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void printAllContacts3()
    {
        for (Contact contact : list)
        {
            System.out.println(contact);
        }
    }
}