package Sixth_session;

public class Overloading {
	
	// Default Constructor
	//public Overloading() {
		
	//}
	// Make constructor 
	public Overloading(String name) {
		System.out.println("This is developer who is using this class: "+name);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading ol = new Overloading("Tina");
		ol.addition();
		
		
	
	}
	// Method Overloading
	public void addition() {
		
	}
	public void addition(int a) {
		
	}
	public void addition(int b,int c , int d) {
		
	}
	public void addition(double c,double e, double k) {
		
	}
	public double addition(double c, double e,int k) {
		double sum = c*e-k;
		System.out.println("sum ="+sum);
		return sum;
		
	}
}
