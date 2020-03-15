package Seventh_session;

public class ClassB_7 extends ClassA_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA_7 call = new ClassA_7();
		call.subclass();
		
		ClassB_7 obj = new ClassB_7();
		obj.subclass();
		
	}
	@Override
	public void subclass() {
		System.out.println("This is Override");
		int a = 120;
		int b = 12;
		int sum = a+b;
		System.out.println(sum);
	}

}
