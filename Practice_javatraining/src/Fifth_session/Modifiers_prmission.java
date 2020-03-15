package Fifth_session;

public class Modifiers_prmission {
	// global variable is created outside the methods
	// global variable can use for any methods
	// if local variable have the same name with global variable 
	// have to use this keyword to point to the global variable
	// this keyword use for the global variable to call 
	// local variable is created inside the methods
	// can use only inside that method
	// create the object for the method that use only in the method that created only
	static int length = 60;
	static int width =8;
	static int com =50;
	static int soft=20;
	int nonstatic = 100;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers_prmission mp = new Modifiers_prmission();
		mp.area();
		mp.circle();
		mp.sum();
		mp.total();
		ST();
	
		
	}
	public void area() {
		int areas=length*width;
		System.out.println(areas);
	}
	public void circle() {
		int circles=length+width;
		System.out.println(circles);
		
	}
	public void sum() {
		int score=com+soft;
		System.out.println("Score = "+score);
	}
	public void total() {
		int sub = com-nonstatic;
		System.out.println("Test non static ="+sub);
	}
	public static void ST() {
		Modifiers_prmission test = new Modifiers_prmission();
		int multi = com*test.nonstatic;
		System.out.println("Test static ="+multi);
	}

}
