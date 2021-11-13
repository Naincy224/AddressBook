package com.bridgeit.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		printWelcomeMessage();
		AddressBookMain addressBookMain = new AddressBookMain();
		AddressBook addressBook = new AddressBook();
		List<Contact> contactList = null;
		String name;
		Scanner sc = new Scanner(System.in);
		boolean runAddressBook = true;
		
		
		while (runAddressBook) {
			System.out.println(
					"\n Enter 1 to add contact to address book\n Enter 2 to search by name and edit contact in address book\n Enter 3 to remove contact from the address book\n Enter 4 to shut down address book\n ");
			int option = sc.nextInt();

			switch (option) {
			case 1:
				Contact contact = addressBookMain.createContact();
				contactList = new ArrayList<Contact>();
				contactList.add(contact);
				addressBook.setContactList(contactList);
				break;
			case 2:
				//ToDo
				break;
			case 3:
				//ToDo
				break;
			case 4:
				sc.close();
				System.out.println("Shutting down address book");
				runAddressBook = false;
			}
		}

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
