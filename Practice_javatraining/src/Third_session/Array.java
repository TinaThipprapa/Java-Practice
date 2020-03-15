package Third_session;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stdID[]= new int[100]; 
		stdID[0]=100;
		stdID[6]=106;
		stdID[24]= 124;
		stdID[39]= 139;
		//System.out.println("Student ID is " +stdID[39]);
		//System.out.println("Student ID is "+stdID[24]);
		//System.out.println(stdID.length);
		
		
		/*for(int i=1; i<stdID.length;i++) {
			
			stdID[i]=i+100; 
			//or stdID[i]=i+i;
			System.out.println("Studen ID ["+i+"] is "+stdID[i]);
			
		}*/
		
		/*int techID[][]=new int[2][3];
		techID[0][0]=49;
		techID[0][1]=98;
		techID[0][2]=104;
		//System.out.println(techID[0][0]);
		System.out.println(techID.length);
		
		for (int x=0;x<techID.length;x++) {
			for(int y=0;y<techID.length+1;y++) {
				techID[x][y]+= x;
				//System.out.println(x);
				System.out.println("teacher id ["+x+"]["+y+"]"+techID[x][y]);
			}
		}*/
		
		final int Row =2 , Column = 3;
		int ID[][]= new int [Row][Column];
		int data = 100;
		
		for(int i=0;i<Row;i++) {
			for(int j=0;j<Column;j++) {
				ID[i][j]=data;
				data +=1;
				System.out.println("Score ["+i+"]["+j+"]= "+ID[i][j]);
			}
		}
		
		
	}

}
