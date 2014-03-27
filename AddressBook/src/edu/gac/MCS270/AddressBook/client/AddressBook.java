package edu.gac.MCS270.AddressBook.client;

import java.util.List;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.AsyncCallback;

import edu.gac.MCS270.AddressBook.shared.EntryData;

public class AddressBook implements EntryPoint {

	private final AddressBookView abView = new AddressBookView();
	private final GetEntryDataServiceAsync entryDataService = GWT.create(GetEntryDataService.class);
	
	public void onModuleLoad() {
		abView.viewMainPage();
	}
	
	//servlet call to get search results
	public void handleInfoSearchRequest(String info) {
		entryDataService.getEntryDataFromServer(
                new AsyncCallback<List<EntryData>>() {
                        public void onFailure(Throwable caught) {
                                return;
                        }

                        @Override
                        public void onSuccess(List<EntryData> data) {
                                abView.viewAddressBookEntries(data);
                        }
                });
	}

	public void getSortedEntriesByLastNameFromServer() {
		// TODO Auto-generated method stub
		
		entryDataService.getLNSortedEntryDataFromServer(
                new AsyncCallback<List<EntryData>>() {
                        public void onFailure(Throwable caught) {
                                return;
                        }

                        @Override
                        public void onSuccess(List<EntryData> data) { 
                                abView.viewAddressBookEntries(data);
                        }
                });
	}

	public void getSortedEntriesByZipFromServer() {
		// TODO Auto-generated method stub
		entryDataService.getZipSortedEntryDataFromServer(
                new AsyncCallback<List<EntryData>>() {
                        public void onFailure(Throwable caught) {
                                return;
                        }

                        @Override
                        public void onSuccess(List<EntryData> data) { 
                                abView.viewAddressBookEntries(data);
                        }
                });
	}

	//client view to delete a contact
	public void deleteContactInfo(EntryData entry) {
		//Service Line of code goes here
				new AsyncCallback<List<EntryData>>(){
			public void onFailure(Throwable caught){
				return;
			}					
				public void onSuccess(List<EntryData> entries){
					abView.sendSuccessfulDeleteMessage();
					abView.viewAddressBookEntries(entries);
			}
		};
		
	}
	
	//adds contact to address book
	public void addAddressHandler(EntryData entries){
		//Service Line of code goes here
		new AsyncCallback<List<EntryData>>(){
			public void onFailure(Throwable caught){
				return;
			}

			@Override
			public void onSuccess(List<EntryData> entries) {
				abView.sendSuccessfulAddMessage();
				abView.viewAddressBookEntries(entries);
			}
		};
	}
	
	public void SubmitEntryToServer(EntryData entryData) {
		// TODO Auto-generated method stub
		
	}
	
}
