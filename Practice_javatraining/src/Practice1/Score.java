package Practice1;

public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Score obj= new Score();
		
		obj.totolScore(72, 83, 74);
	}
	
	public float totolScore(float com, float math, float eng) {
		float total = ((com+math+eng)*100)/300;
		System.out.println("Computer score = "+com);
		System.out.println("Math score = "+math);
		System.out.println("English score = "+eng);
		System.out.println("Total Score = "+total);
		
		if(total>=90 && total<=100) {
			System.out.println("Student got Grade A");
		}else if(total>=80 && total<=89) {
			System.out.println("Student got Grade B");
		}else if (total>=70 && total<=79) {
			System.out.println("Student got Grade C");
		}else if (total>=60 && total<=69) {
			System.out.println("Student got Grade D");
		}else {
			System.out.println("Student got Grade F");
		}
		return total;
	}
	

}
