package Sixth_session;

public class Child extends Parent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// if create object for Parent class, it cannot use for Child
		// Have to create object for Child, it can access for Parent and Child
		
		Parent call = new Parent(); // Object for Parent class
		call.add();
		System.out.println(call.sum); // Protected variable from Parent
		
		Child obj = new Child();       // Object for Child class
		obj.subtraction();             // This object can access method 
		obj.add();                     // from parent class and child class
		System.out.println(obj.name);  // This object can access protected variable
		System.out.println(obj.sum);   // This object can access default variable
		    						   // Cannot access private variable
	}
	public void subtraction() {
		int b =20;
		int c=2;
		int d=b-c;
		System.out.println(d);
	}
	

}
