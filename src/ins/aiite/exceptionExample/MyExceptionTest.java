package ins.aiite.exceptionExample;

public class MyExceptionTest {
	public static void main(String[] args) {
		MyExceptionService myExceptionService=new MyExceptionService();
		try
		{
			myExceptionService.myLogic(100, 50,"");
		}
		catch(MyException e)
		{
			System.err.println("Error: "+ e.getMessage());
		}
		System.out.println("Print me");
		
	}
	

}
