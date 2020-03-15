package Practice1;

public class Convert_Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Convert_Min obj = new Convert_Min();
	
		obj.MinSec(5);
		obj.add(2, 9);
		obj.cal(25, "+", 32);
		obj.cal(2, "*",35);
		obj.cal(20, "A", 25);
	}
	public int MinSec(int min) {
		int sec = min*60;
		System.out.println(min+" minutes = "+sec+"seconds");
		return sec;
	}
	public int add(int a, int b) {
		int sum = a+b;
		System.out.println(a+"+"+b+"="+sum);
		return sum;
	}
	//use == operators for reference comparison (address comparison)  
	//and .equals() method for content comparison.  
	//In simple words, == checks if both objects point to the same memory location 
	//whereas .equals() evaluates to the comparison of values in the objects.
	
	public  int cal(int num1, String operator ,int num2) {
		
		if ("+".equals(operator) ) { // ()
			int cal1 = num1+num2;
			System.out.println(num1+"+"+num2+"="+cal1);
			return cal1;
		} else if ("-".equals(operator)) {
			int cal2=num1-num2;
			System.out.println(num1+"-"+num2+"="+cal2);
			return cal2;
		} else if ("*".equals(operator)) {
			int cal3=num1*num2;
			System.out.println(num1+"*"+num2+"="+cal3);
			return cal3;
		} else if ("/".equals(operator)) {
			int cal4 = num1/num2;
			System.out.println(num1+"/"+num2+"="+cal4);
			return cal4;
		} else {
			//don't forgot to return value
			System.out.println("Cannot Calculate");
			return 0;
		}
		

	}
}
