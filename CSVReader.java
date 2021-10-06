/*
 * 
 * CSVReader.java
 * This class has Two Methods writeToCSV, that takes in a UserInfo Object as a paramter, and filters out all the data and writes it to the Excel sheet
 * 		If the Excel does not excests it creates one and adds the Passed in UserInfo Object to the Excel
 * 		and if the Excel excists , it opens that file, and adds the userInfo Object Data to the end of it
 * 
 * This Class also Has a readFromCSV() method, where it's Job to fetch data from the CSV File.
 * 		If the CSV file excits it checks the dtaa normally while also ignoring the first Line (The Title of the File)
 * 		if the Excel file doesn't excist, then it creates one and leaves it empty.
 * 		It does that So the Program does not crash when the User clicks on the Show Contacts button when the file has not been created yet.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class CSVReader {
		static HashMap<String, UserInfo> users = new HashMap<String,UserInfo>();
		public  void writeToCSV(UserInfo user) throws IOException {
		String filePath = DataBaseRunner.filePath;
		File f = new File(filePath);
		FileWriter fileWriter = null;
			if(!f.exists()) {
					try {
							fileWriter = new FileWriter(filePath);
							fileWriter.append("Name,Phone Number,Email,Street Address,Town,State, Zip Code");
							fileWriter.append("\n");
							fileWriter.append(user.getName());
							fileWriter.append(",");
							fileWriter.append(user.getPhoneNumber());
							fileWriter.append(",");
							fileWriter.append(user.getEmail());
							fileWriter.append(",");
							fileWriter.append(user.getStreetAddress());
							fileWriter.append(",");
							fileWriter.append(user.getTown());
							fileWriter.append(",");
							fileWriter.append(user.getState());
							fileWriter.append(",");
							fileWriter.append(user.getZipCode());
					} catch (Exception e){
							e.printStackTrace();
					} finally {
						try {
							fileWriter.flush();
							fileWriter.close();
						} catch (Exception e) {
							e.printStackTrace();
						  }
					  }	
			} else if(f.exists()) {
				FileWriter fw = new FileWriter(filePath,true);
				try {
					fw.append("\n");
					fw.append(user.getName());
					fw.append(",");
					fw.append(user.getPhoneNumber());
					fw.append(",");
					fw.append(user.getEmail());
					fw.append(",");
					fw.append(user.getStreetAddress());
					fw.append(",");
					fw.append(user.getTown());
					fw.append(",");
					fw.append(user.getState());
					fw.append(",");
					fw.append(user.getZipCode());
				}catch(Exception e) {
					e.printStackTrace();
				} finally {
					try {
						fw.close();
					}catch (Exception e) {
						e.printStackTrace();
					  }
				}
			}
	}
}





