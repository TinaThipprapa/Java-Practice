package Seventh_session;

public class UseAbstract extends Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		UseAbstract object = new UseAbstract();
		object.subtraction(); // method from Abstraction class
		object.addition();    // method from UseAbstract class
		object.multiply();    // method from UseAbstract class
		object.name();        // method from UseAbstract class

	}
	// For Abstract class and Abstract method
	// use inheritance concept and override concept 
	// add unimplemented method 
	// it will auto generated
	// have to create the whole abstract method in Child class 

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		System.out.println("Addition");
		
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		System.out.println("multiply");
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("name");
		
	}
	

}
