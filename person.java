package inheritance;

public class person extends Object {

	private String name;
	private String email;
	private String phoneNumber;
	
	
	
	public person(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//overriding the super class
	public String toString() {
        return name+"#"+ email +"#" + phoneNumber;
    }
	
}
