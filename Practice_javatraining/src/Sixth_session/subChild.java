package Sixth_session;

public class subChild extends Child{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subChild test = new subChild();
		System.out.println(test.sum); // Protected variable from parent
		System.out.println(test.name);// Default variable  from parent
		test.add();   // from Parent
		test.subtraction(); // From Child
		test.add();
	
	}
	//if subChild has same method with Parent, it use that same method from subChild
	//it call Override
	
	@Override //additional check method override
	public void add() {
		int t=35;
		int s=24;
		int v=t+s;
		System.out.println(v);
	}

}
