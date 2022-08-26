package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    public static Scanner scanner = new Scanner(System.in);
    ArrayList<Contact> contactArrayList = new ArrayList<>();
    private String addressBookName;

    public String getAddressBookName() {
        return addressBookName;
    }

    public void setAddressBookName(String addressBookName) {
        this.addressBookName = addressBookName;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "addressBookName='" + addressBookName +
                ", contactArrayList=" + contactArrayList + '\'' +
                '}';
    }

    public void createContact() {
        Contact contact = new Contact();
        System.out.println("Enter the Name");
        String name = scanner.next();
        contact.setName(name);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();
        contact.setAge(age);
//        System.out.println("Enter the Phone Number");
//        long phoneNumber = scanner.nextLong();
//        contact.setPhoneNumber(phoneNumber);
//        System.out.println("Enter the City");
//        String city = scanner.next();
//        contact.setCity(city);
//        System.out.println("Enter the State");
//        String state = scanner.next();
//        contact.setState(state);
        contactArrayList.add(contact);
    }

    public void multiplyContact() {
        System.out.println("how many contact are creating");
        int numberOfContact = scanner.nextInt();
        for (int i = 1; i <= numberOfContact; i++) {
            System.out.println("Person " + i + " Datils");
            createContact();
        }
    }
}
