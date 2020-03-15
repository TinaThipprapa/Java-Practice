package Sixth_session;

public class CallPrivate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Global call = new Global(); //create object to use non static method into static method
		call.pass();
		
		String newPassword = call.getPassword();
		System.out.println(newPassword);
		
		call.setPassword("djiejfk");
		//System.out.println("Change password is "+call.getPassword());
		call.setPassword("tidjfewof");
	}

}
