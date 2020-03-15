package First_session;

public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Addition
		int x = 30;
		int y = 20;
		int z = x+y;
		System.out.println("x+y = "+z);
		//Subtraction
		int t = x-y;
		System.out.println("x-y = "+t);
		//Multiply
		int m = x*y;
		System.out.println("x*y = "+m);
		//Division
		float d = x/y;
		System.out.println("x/y = "+d);
		//Modulus
		int md = x%y;
		System.out.println("x%y = "+md);
		int r=4;
		int o=6;
		int g=r+o;
		int w=r-o;
		boolean i=(r==o)||(g==r)||(o==g);
		boolean j=(g==o)||(g==r)&&(r==o);
		System.out.println("The value g is "+g);
		System.out.println("The value w is "+w);
		System.out.println(w);		
		System.out.println(i);
		System.out.println(j);
		
	}

}
