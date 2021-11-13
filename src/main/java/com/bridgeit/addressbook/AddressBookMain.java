package com.bridgeit.addressbook;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		printWelcomeMessage();
		AddressBookMain addressBookMain = new AddressBookMain();
		Contact contact = addressBookMain.createContact();
		System.out.println(contact);
	}
		
		
	

	public static void printWelcomeMessage() {

		System.out.println("Welcome to AddressBook system Program");

	}

	public Contact createContact() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first name:");
		String firstName = sc.nextLine();
		System.out.println("Enter last name:");
		String lastName = sc.nextLine();
		System.out.println("Enter address:");
		String address = sc.nextLine();
		System.out.println("Enter city:");
		String city = sc.nextLine();
		System.out.println("Enter state:");
		String state = sc.nextLine();
		System.out.println("Enter email address:");
		String email = sc.nextLine();
		System.out.println("Enter zip code:");
		int zip = sc.nextInt();
		System.out.println("Enter phone number:");
		long phNumber = sc.nextLong();

        
		Contact contact = new Contact();
		contact.setFirstName(firstName);
		contact.setLastNames(lastName);
		contact.setAddress(address);
		contact.setCity(city);
		contact.setState(state);
		contact.setZip(zip);
		contact.setPhoneNumber(phNumber);
		contact.setEmail(email);
		return contact;
	}

}
