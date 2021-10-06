/*	
 * UserInfo.Java
 * This Class Created a User Object with all the User Info
 * 	String name;
 *	String phoneNumber;
 *	String email;
 *	String streetAddress;
 *	String town;
 *	String state;
 *	String zipCode;
 *
 *  With all of it's Mutators and Setters 
 * 
 */
public class UserInfo {
	private String name;
	private String phoneNumber;
	private String email;
	private String streetAddress;
	private String town;
	private String state;
	private String zipCode;
	
	//Default Constructor
	public UserInfo() {
		this.name  = "Name";
		this.phoneNumber  = "Phone Number";
		this.email  = "Email";
		this.streetAddress  = "Street Address";
		this.town  = "Town";
		this.state  = "State";
		this.zipCode  = "Zip Code";
	}
	
	//Constructor to Set Value
	public UserInfo(
			String name,
			String phoneNumber,
			String email,
			String streetAddress,
			String town,
			String state,
			String zipCode) {
		this.name  = name;
		this.phoneNumber  = phoneNumber;
		this.email  = email;
		this.streetAddress  = streetAddress;
		this.town  = town;
		this.state  = state;
		this.zipCode  = zipCode;
	}
	
	
	//Accessors Methods
	public String getName() {
		return this.name;
	}
	
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getStreetAddress() {
		return this.streetAddress;
	}
	
	public String getTown() {
		return this.town;
	}
	
	public String getState() {
		return this.state;
	}
	
	public String getZipCode() {
		return this.zipCode;
	}
	
	// Mutators Methods
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	
	public void setTown(String town) {
		this.town = town;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
