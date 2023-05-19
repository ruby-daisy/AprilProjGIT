package ins.aiite.exceptionHandling;

public class ErrorSample {
	
	void recursionMethod(int i)
	{
		while(i>0)
		{
			i+=1;
			recursionMethod(i);			
		}
	}
	
	void methodTwo()
	{
		System.out.println("Method");
	}

	public static void main(String[] args) {
		
		ErrorSample es= new ErrorSample();
		es.recursionMethod(5);
		es.methodTwo();
	}

}
