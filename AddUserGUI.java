/*
 * AddUserGUI.java
 * This Class Creates a GUI Object for after the User click the "Add" Button, and calls this class
 * it has Texts of what each text Field box Represents and next to it Text Field Boxes
 * with Two Buttons, "Back" Button to take the User Back to the Main Menu, and also a "Add" Button,
 * To take the Entered information by the User and add them to the Excel Sheet by takes those inputs and sending it to the UpdateDataBase class
 * 	and calling the addUser method, with Paramters of all the User informatin
 * 	then the addUser method in the UpdateDataBase with finish Adding those data to the CSVReader class method
 * 
 * it also has two methods, and clearText(),
 * 	The GoBack method return the user to the main page when they click on the Back Button.
 * 	clearText Method clears the Input texts, so when the User goes back and clicks on Add User again, then it takes them to a clean page of Add User.
 * 
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AddUserGUI implements ActionListener{
	
	UpdateDataBase newudb = new UpdateDataBase();
	
	
	
	private static JFrame frame = new JFrame();
	private static JPanel panel = new JPanel();
	
	private static JTextField userText;
	private static JTextField phoneTextField;
	private static JTextField emailTextField;
	private static JTextField streetTextField;
	private static JTextField townTextField;
	private static JTextField stateTextField;
	private static JTextField zipCodeTextField;
	
	public void addUser() {
		
		int padding = 35;
		int PaddingX = 25;
		int paddingXTextField = 135;
		// Creates the Frame with the Set Size
		
		frame.setSize(500,460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.add(panel);
		panel.setLayout(null);
		
    	panel.setVisible(true);
		frame.setVisible(true);
		
		//Created the Welcome Message Label
		JLabel welcomeMessage = new JLabel("Welcome To Your Own Personal Phone-Book!");
		welcomeMessage.setBounds(100,15,300,25);
		panel.add(welcomeMessage);
		
		//Created the userName Label
		JLabel userLabel = new JLabel("Name");
		userLabel.setBounds(PaddingX,welcomeMessage.getY() + padding ,80,25);
		panel.add(userLabel);
		
		//Created the userName Text Field
		 userText = new JTextField(40);
		userText.setBounds(paddingXTextField,welcomeMessage.getY() + padding ,165,25);
		panel.add(userText);
		
		//Created the Phone Number Label
		JLabel phoneNumber = new JLabel("Phone Number");
		phoneNumber.setBounds(PaddingX,userLabel.getY() + padding ,155,25);
		panel.add(phoneNumber);
		
		//Created the phoneNumber Text Field
		 phoneTextField = new JTextField(15);
		phoneTextField.setBounds(paddingXTextField,userText.getY() + padding ,165,25);
		panel.add(phoneTextField);
		
		//Created the Email Label 
		JLabel email = new JLabel("Email");
		email.setBounds(PaddingX,phoneNumber.getY() + padding ,80,25);
		panel.add(email);
		
		//Created the Email Text Field 
		 emailTextField = new JTextField(100);
		emailTextField.setBounds(paddingXTextField,phoneTextField.getY() + padding ,165,25);
		panel.add(emailTextField);
		
		//Created the Street Address Label
		JLabel streetAddress = new JLabel("Address");
		streetAddress.setBounds(PaddingX,email.getY() + padding ,80,25);
		panel.add(streetAddress);
		
		//Created the Street Address Text Field
		 streetTextField = new JTextField(100);
		streetTextField.setBounds(paddingXTextField,emailTextField.getY() + padding ,165,25);
		panel.add(streetTextField);
		
		//Created the Town Label
		JLabel town = new JLabel("Town");
		town.setBounds(PaddingX,streetAddress.getY() + padding ,80,25);
		panel.add(town);
		
		//Created the Town Text Field
		 townTextField = new JTextField(100);
		townTextField.setBounds(paddingXTextField,streetTextField.getY() + padding ,165,25);
		panel.add(townTextField);
		
		//Created the State Label
		JLabel state = new JLabel("State");
		state.setBounds(PaddingX,town.getY() + padding ,80,25);
		panel.add(state);
		
		//Created the State Text Field
		 stateTextField = new JTextField(100);
		stateTextField.setBounds(paddingXTextField,townTextField.getY() + padding ,165,25);
		panel.add(stateTextField);
		
		//Created the Zip Code Label
		JLabel zipCode = new JLabel("Zip Code");
		zipCode.setBounds(PaddingX,state.getY() + padding ,80,25);
		panel.add(zipCode);
		
		//Created the Zip Code Text Field
		 zipCodeTextField = new JTextField(100);
		zipCodeTextField.setBounds(paddingXTextField,stateTextField.getY() + padding ,165,25);
		panel.add(zipCodeTextField);
		
		
		// Creates a Button and Puts it at the Button of the Panel
		JButton mainButton = new JButton("Add User");
		mainButton.setBounds(zipCodeTextField.getX() + padding,zipCodeTextField.getY() + padding, 85, 25);
		mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
				try {
					newudb.addUser(
							userText.getText(),
							phoneTextField.getText(), 
							emailTextField.getText(), 
							streetTextField.getText(), 
							townTextField.getText(), 
							stateTextField.getText(), 
							zipCodeTextField.getText()
							);
					clearText();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
            }
		});
		panel.add(mainButton);
		
		//Sets Frame to Visible
		frame.setVisible(true);

	}
	
	public void clearText() {
		userText.setText("");
		phoneTextField.setText("");
		emailTextField.setText("");
		streetTextField.setText("");
		townTextField.setText("");
		stateTextField.setText("");
		zipCodeTextField.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
