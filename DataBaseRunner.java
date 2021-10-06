/*
 * 
 * DataBaseRunner.java
 * 
 * This is the Runner class that contains the Main Method, and the main method calls the gui.StartGUI()method to start the first Page of the UI for the User.
 * 
 */
import java.util.*;

public class DataBaseRunner {
	
	// Declaring a Scanner object scanner to Be Static so It can be used Accrose the entire Program, Instead of defining multiple Scanners
	static Scanner scanner = new Scanner(System.in); 
	static AddUserGUI user = new AddUserGUI();
	
	  static String filePath = "/Users/naeimsalib/Desktop/Projects/UserLoginPage/src/usersDataBase.csv";
	 
	public static void main(String[] args) {
		
		user.addUser();
		
	}// End of main Method
	
}// End Of Class
