package Third_session;

public class Windows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Windows obj = new Windows();
		obj.Test();
		
		
	}
	public void Test() {
		int StdID[] = new int [100];
		
		for (int i=1;i<StdID.length;i++) {
			StdID[i]= i+100;
			System.out.println("Student Id ["+i+"]="+StdID[i]);
			
		}
		
	}

}
