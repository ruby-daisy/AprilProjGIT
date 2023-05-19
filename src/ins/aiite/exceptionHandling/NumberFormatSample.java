package ins.aiite.exceptionHandling;

import java.util.Scanner;

public class NumberFormatSample {

	protected void finalize()
	{
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age: ");
				String s=sc.next();
		
				try
				{
					int num=Integer.parseInt(s);
					System.out.println(num);
				}
				catch(NumberFormatException np)
				{
					System.out.println("Enter numeric values only. characters not allowed");
				}
				finally
				{
					System.out.println("Close DBConnection");
					//clean up
					//closing files, dbconnection,driver instance
				}
				
				
		
		
		System.out.println("Print after coversion takes place");
		
		

	}

}
