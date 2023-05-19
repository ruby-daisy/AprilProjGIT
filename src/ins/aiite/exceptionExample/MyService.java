package ins.aiite.exceptionExample;

import java.io.IOException;

public class MyService {

	public int mathMethod(int a ,int b) throws ClassNotFoundException, ArithmeticException,NullPointerException
	{
		Class.forName("a.txt");	
		int div = a/b;
		return div;
		
		
	}
}
