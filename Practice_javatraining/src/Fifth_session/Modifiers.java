package Fifth_session;

// we can use static variables, methods in the same package 
// and call non static  method, variable in the same package by object
// if we want call from another package 
// we have to import package before call the method or variable
// Private can access only in the same class
// Protected can access only in the same package and available for subclass
// Default can access only in the same package but cannot use for subclass
// Encapsulation (Data Hiding Concept)
// for private variables or methods if we want to use, we have to create public method
// to access private variables or methods 
public class Modifiers {
	public String email= "Tina@gmail.com";
	private String ATM = "12345";
	protected String age = "37";
	String account ="2542637";
	private String pin; //global variable
	
	
	public void  atm() {
		System.out.println(ATM);
	}
	public void atmid(String pin) { //local variable
		this.pin = pin;				//put local to global
		System.out.println("Pin number is "+this.pin);//this keyword to point for global variable
		String atmpin = getATM();
		System.out.println("This is setter method value "+atmpin);
	}
	//Getter and Setter
	public String getATM() {
		return ATM;
	}
	public void setATM(String aTM) {
		ATM = aTM;
		System.out.println("ATM ID global "+this.ATM);
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}
