package com.bridgeit.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	
	private List<Contact> contactList;

	public List<Contact> getContactList() {
		return contactList;
	}

	public void setContactList(List<Contact> contactList) {
		
		if(this.contactList==null) {
			
			this.contactList= new ArrayList<Contact>();
		}
		this.contactList = contactList;
	}
	

}
