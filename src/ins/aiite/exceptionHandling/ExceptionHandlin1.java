package ins.aiite.exceptionHandling;

public class ExceptionHandlin1 {
	
	void m1(int a,int b)
	{
		try
		{
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occured in division method" + e);
		}
		
	}
	
	void m2()
	{
		System.out.println("Successfully executed method 2");
	}

	public static void main(String[] args) {
		
		
		ExceptionHandlin1 eh=new ExceptionHandlin1();
		eh.m1(40, 0);
		eh.m2();
		

	}

}
