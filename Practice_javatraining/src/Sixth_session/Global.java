package Sixth_session;

public class Global {
	public  String name ="Tina";  // Global Variable , access modifier is public
	private String password ="123456"; //Global Variable , access modifier is private
	
	//for private variable, we have to create public method to access 
	
	public void pass() {
		System.out.println("this is password "+ password);
	}
//Getter and Setter generate by java program
	
//Getter means read it
	public String getPassword() {
		//System.out.println("password "+password);
		return password;
	}
//Setter mean reset it
	public void setPassword(String password) {
		this.password = password;
		System.out.println("Change Password is "+this.password);
	}	
	
}

