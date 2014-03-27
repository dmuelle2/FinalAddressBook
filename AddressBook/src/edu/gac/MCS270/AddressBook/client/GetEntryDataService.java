package edu.gac.MCS270.AddressBook.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;

import edu.gac.MCS270.AddressBook.shared.EntryData;

public interface GetEntryDataService extends RemoteService{

	public List<EntryData> getEntryDataFromServer();
	public List<EntryData> getLNSortedEntryDataFromServer();
	public List<EntryData> getZipSortedEntryDataFromServer();
	
}
