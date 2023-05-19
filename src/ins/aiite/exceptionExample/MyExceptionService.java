package ins.aiite.exceptionExample;

public class MyExceptionService {
	
	public void myLogic(int a,int b, String pwd) throws MyException
	{
		
		if(pwd.isEmpty())
		{
			throw new MyException("Empty String");
		}
		if(b==0)
		{
			throw new MyException("You are Trying to divide a number by zero. Please provide a valid number");
			
		}
		
		System.out.println(pwd);
		System.out.println(a/b);
	
		
		
	}
		
	

}
