package edu.gac.MCS270.AddressBook.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import edu.gac.MCS270.AddressBook.client.GetEntryDataService;
import edu.gac.MCS270.AddressBook.shared.EntryData;

@SuppressWarnings("serial")
public class GetEntryDataServiceImpl extends RemoteServiceServlet implements GetEntryDataService {

	//CHANGE WEB.XML?!?!!?!?!?!?!?!?!?!?!?!?

	public List<EntryData> getEntryDataFromServer(String search) { 
		return AddressBookModel.getSearchData(search);
	}

	@Override
	public List<EntryData> getEntryDataFromServer() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<EntryData> getLNSortedEntryDataFromServer() { 
		return AddressBookModel.getLNSortedSearchData();
	}

	@Override
	public List<EntryData> getZipSortedEntryDataFromServer() {
		// TODO Auto-generated method stub
		return AddressBookModel.getZipSortedSearchData();
	}

	
}
