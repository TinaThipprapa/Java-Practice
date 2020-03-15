package First_session;

public class CallMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create object for non static method
		CallMethod obj=new CallMethod();
		
		//how to use the object and put value to variable
		int mul1= obj.muliply(5, 8);
		int mul2 = obj.muliply(9, 4);
		System.out.println("5*8 ="+mul1);
		System.out.println("9*4 ="+mul2);
		
		int n = obj.dimens(20, 12, 15);
		System.out.println("Dimension w*l*h ="+n+"cm");
		
		double tri1 = obj.triangle(20.5f, 12);
		System.out.println("Triangle value is "+tri1);
		double tri2 = obj.triangle(10.6f, 2.25f);
		System.out.println("Triangle value is "+tri2);
		double tri3 = obj.triangle(45.10f, n);
		System.out.println("Triangel value is "+tri3);
		
		//if need to call non static method from another class
		//have to create object for another class to call it.
		average call = new average();
		int salary1=call.profit(12727, 7872);
		System.out.println("Jan is "+salary1);
		
	}
	
	public int muliply(int x, int y) {
		int z=x*y;
		return z;
	}
	public int dimens(int w,int l,int h) {
		int v=w*l*h;
		return v;
	}
	public double triangle(float base, float height) {
		double area=0.5*(base*height);
		System.out.println("Base is "+base+" Height is "+height);
		return area;
	}
	
	

}
