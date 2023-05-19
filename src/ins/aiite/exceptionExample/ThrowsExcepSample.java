package ins.aiite.exceptionExample;

public class ThrowsExcepSample {

	public static void main(String[] args) {
		
		MyService ms=new MyService();
		try
		{
		System.out.println(ms.mathMethod(100, 0));
		}
		catch(ClassNotFoundException e)
		{
			System.err.println("Error: " + e.getMessage());
		}
		catch(ArithmeticException e)
		{
			System.err.println("Error: " + e.getMessage());
		}
		catch(NullPointerException e)
		{
			System.err.println("Error: " + e.getMessage());
		}
	

	}

}
