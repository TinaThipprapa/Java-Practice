package First_session;

public class conditon_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int p=10;
		
		if (p<=10) {
			p++;
			System.out.println(p);
		}
		
		// equal to
		int x=11;
		
		if (x==11) {
			System.out.println("The value of x is "+x);
		}
		// not equal to
		int y=10;
		
		if (y!=8) {
			System.out.println("The value of y is "+y);
		}
		// greater than
		if (x>8) {
			x++;
			System.out.println("The value of x is "+x);
		}
		// less than
		if (x<10){
			System.out.println("The value of x is "+x);
		}
		//greater than and equal to
		if (y>=10) {
			y++;
			System.out.println("The value of y is "+y);
		}
		//less than and equal to
		if (y<=11) {
			y--;
			System.out.println("The value of y is "+y);
		}
		
		int u=6;
		if (u<=6 && u<6) {
			System.out.println("This is value of u :"+u);
		} else {
			u++;
			System.out.println("The value of U is " +u);
			System.out.println("Condition is not true");
		}
			
		// declare variable whose values is 100
		//add two conditions variable is greater than 100 variable equal to 100
		//write program for if else statement which shows result with and , or operator
		
		int t=100;
		if (t>100 && t==100) {
			System.out.println("This is value of t is "+t);
		}else {
			t++;
			System.out.println("The value of T is "+t);
			System.out.println("Condition is not true");
		}
		
		int n=100;
		if (n>100 || n==100) {
			System.out.println("This is value of n is "+n);
		}else {
			System.out.println("The value of N is "+n);
			System.out.println("Condition is not true");
		}
		
		//if else if
		float prg = 85.9f;
		if (prg>=90 && prg <100) {
			System.out.println("Grade of student : A");
		} else if (prg >=80 && prg <= 89) {
			System.out.println("Grade of student : B");
		} else if (prg >=70 && prg <=79) {
			System.out.println("Grade of student : C");
		} else if (prg>=60 && prg <=69) {
			System.out.println("Grade of student : D");
		} else {
			System.out.println("Grade of student : F");
		}
		
		// find biggest number
		//Nested if 
		int v=60;
		int r=80;
		int i=280;
		if (v>r) {
			if (v>i) {
				System.out.println("Bigger is t");
			} else {
				System.out.println("Bigger is i");
			}
		} else if (r>i) {
			System.out.println("Bigger is r");
		} else {
			System.out.println("Bigger is i");
		}
		
	}

}
