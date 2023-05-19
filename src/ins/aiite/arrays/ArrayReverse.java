package ins.aiite.arrays;

public class ArrayReverse {
	
	
	public static void main(String[] args) {
		
		String str[]=new String[3];
		str[2]="Java";
		str[1]="Selenium";
		str[0]="Junit";
		
		for(int i=str.length-1;i>=0;i--)
		{
			System.out.print(" REv" + str[i]);// value retrieval
		}
	}

}
