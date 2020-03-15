package Third_session;

import Fifth_session.Modifiers;
// use global variable from another package
// have to import the package that have the class which you wanna use

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB obj = new ClassB();
		obj.test();
		
		Modifiers mod = new Modifiers();
		System.out.println(mod.email);
		mod.atm();
				
	}

}
