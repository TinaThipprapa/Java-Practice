package Fifth_session;

public class Modifier_Test {
	// Public can access same class same package and another package
	// if we use in another package, we have to import package before use it 
	// example in Third_session(ClassA)
	// Private can access only in the same class
	// Protected can access only in the same package and available for subclass
	// Default can access only in the same package but cannot use for subclass

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifiers mod = new Modifiers();
		System.out.println("Public is"+mod.email);
		System.out.println("Protected is "+mod.age);
		System.out.println("Default is "+mod.account);
		mod.atm();
		mod.atmid("2365q");
		mod.setATM("2536294");
	}

}
