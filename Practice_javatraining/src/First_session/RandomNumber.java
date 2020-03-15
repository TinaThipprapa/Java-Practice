package First_session;

public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumber obj = new RandomNumber();
		obj.random(9, 20);
		//obj.nub();
	
	}
	//x(n+1)= (ax(n)+b)mod m
	public void random(int x,int y) {
		
		for(int i=1;i<=y;i++) {
			int a=x;
			 a+=(((a*x)*(i)+y)%y);
			 
			 System.out.println(a);
			 
		}
		//return a;
	}
	/*public void nub() {
		for (int n=1 ;n<=100;n++) {
			System.out.println(n);
			
		}
	}*/
		

}
