package ins.aiite.arrays;

public class TwoDimArray {
	
	public static void main(String[] args) {
		int[][] td=new int[3][2];
		td[0][0]=1;
		td[0][1]=2;
		td[1][0]=3;
		td[1][1]=4;
		td[2][0]=5;
		td[2][1]=6;
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++) {
				System.out.print(td[i][j]);
			}
			System.out.println();
		}
		
		
	}
	
	
	
	

}
