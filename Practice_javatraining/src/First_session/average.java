package First_session;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*float computer = 60.8f;
		float linux = 50.7f;
		float software =30.9f;
		float avg = ((computer+linux+software)*100)/300;
		System.out.println(avg);
		
		if (avg>=90 && avg <100) {
			System.out.println("Grade of student : A");
		} else if (avg >=80 && avg <= 89) {
			System.out.println("Grade of student : B");
		} else if (avg >=70 && avg <=79) {
			System.out.println("Grade of student : C");
		} else if (avg>=40 && avg <=69) {
			System.out.println("Grade of student : D");
		} else {
			System.out.println("Grade of student : F");
		}*/
		//addtion();
		//addtion();
		/*for(int i=0;i<=5;i++) {
			multiply();
		}*/
		//Create object for execute non static on static method
		//
		average obj= new average();
		
		int d=obj.profit(12000,2000);
		int c=obj.profit(10000,3000);
		int b=obj.profit(90000, 1234);
		int total=d+c+b;
		System.out.println("January "+d);
		System.out.println("February "+c);
		System.out.println("March "+b);
		System.out.println("3 month total =" +total);
		
		
		
	}//void not return anything
	public static void addtion() {
		int a=60;
		int b=26;
		int c=a+b;
		System.out.println(c);
	}
	public static void multiply() {
		int x=20;
		int y=3;
		int z=x*y;
		System.out.println("Multiply "+z);
			
	} //static method can use in the same static method
	  //non static method cannot use in static method 
	  //should create object for execute non static method
	  //if method create by data type, it should return values for calculate
	  
	public  int profit(int income,int expense) {
		//int income=10000;
		//int expense=6000;
		int netprofit=(income-expense);
		//System.out.println("Profit of company "+netprofit);
		return netprofit;
	}
	
	

}
