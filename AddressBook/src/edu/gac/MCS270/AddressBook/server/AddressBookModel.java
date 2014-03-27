package edu.gac.MCS270.AddressBook.server;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;
import javax.jdo.Query;

import edu.gac.MCS270.AddressBook.shared.EntryData;


public class AddressBookModel {
	static final PersistenceManagerFactory pmf = PMF.get();
	
	public static List<EntryData> getSearchData(String search) {
   		List<EntryData> entries = getEntryData();
   		List<EntryData> searching = new ArrayList();
        	for (EntryData entry : entries){
        		if(entry.getFirstName().contains(search)){
        			searching.add(entry);
        			continue;
        		}else if(entry.getLastName().contains(search)){
        			searching.add(entry);
        			continue;
        		}else if(entry.getAddress().contains(search)){
        			searching.add(entry);
        			continue;
        		}else if(entry.getCity().contains(search)){
        			searching.add(entry);
        			continue;
        		}else if(entry.getState().contains(search)){
        			searching.add(entry);
        			continue;
        		}else if(Integer.toString(entry.getZip()).contains(search)){
        			searching.add(entry);
        			continue;
        		}else if(entry.getEmail().contains(search)){
        			searching.add(entry);
        			continue;
        		}else if(Integer.toString(entry.getPhone()).contains(search)){
        			searching.add(entry);
        			continue;
        		}
        	}
        	return new ArrayList<EntryData>(searching);
        }

	private static List<EntryData> getEntryData() {
		PersistenceManager pm = pmf.getPersistenceManager();
        Query query = pm.newQuery(EntryData.class);
        List<EntryData> entries = (List<EntryData>) query.execute();
        return new ArrayList<EntryData>(entries);
	}
	
}