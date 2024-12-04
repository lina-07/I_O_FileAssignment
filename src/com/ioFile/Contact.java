package com.ioFile;

public class Contact {
    private String Name;
    private String PhoneNo;
    private String Email;

    public Contact(String Name, String PhoneNo, String Email) {
       this.Name = Name;
       this.PhoneNo = PhoneNo;
       this.Email = Email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "Name='" + Name + '\'' +
                ", PhoneNo=" + PhoneNo +
                ", Email='" + Email + '\'' +
                '}';
    }
}
