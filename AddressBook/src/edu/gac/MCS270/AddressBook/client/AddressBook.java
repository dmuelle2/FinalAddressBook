package edu.gac.MCS270.AddressBook.client;

import com.google.gwt.core.client.EntryPoint;

public class AddressBook implements EntryPoint {

	private final AddressBookView abView = new AddressBookView();
	
	public void onModuleLoad() {
		abView.viewMainPage();
	}
	
	public void handleInfoSearchRequest(String info) {
        // Need to implement servlet communication
	}

	
	
}
