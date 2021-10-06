
//import java.util.*;
/*
 * 	 UpdateDataBase.java
 * 
 * Created a UserInfo Object (newUser), and a CSVReader Object (witedata)
 * 	it's Methods:
 * 		1) addUser:
 * 		    takes in all UserInfo Information and created a newUser
 * 			Sends it to writeData.writeToCSV(function) to write it to the Excel File
 * 		2) PrintDataBase:
 * 			Created a new ContactsGUI (cGUI), and calls the displayContacts() function
 * 		3) also calls readFromCSV using CSVReader Object (writeData), that is going to Print all data in a new GUI page
 */
import java.io.IOException;


public class UpdateDataBase {
	UserInfo newUser = new UserInfo();
	CSVReader writeData = new CSVReader();
	
	String userName;
	String phoneNumber;
	String email;
	String streetAddress;
	String town;
	String state;;
	String zipCode;
	// Method to Add a UserName to the DatatBase.
	public void addUser(String name,String phoneNumber,String email,String streetAddress,String town,String state,String zipCode) throws IOException {
		newUser = new UserInfo(name,phoneNumber,email,streetAddress,town,state,zipCode);
		writeData.writeToCSV(newUser);
	}
}
