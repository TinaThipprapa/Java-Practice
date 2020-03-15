package Fifth_session;

import Sixth_session.Parent;

public class Child5 extends Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child5 call = new Child5();
		call.add();
		System.out.println(call.sum); // Protected from Parent
            						  // cannot call default from Parent
	}

}
