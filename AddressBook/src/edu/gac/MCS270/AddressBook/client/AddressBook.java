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

	
	
}
