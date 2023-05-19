package ins.aiite.exceptionHandling;

public class NullPointerExceptionSample {
	static String name=null;
	public static  void nameLength()	
	{
		System.out.println(name.length());
	}

	public static void main(String[] args) {		
		try
		{
			nameLength();
			
			
		}
		catch(NullPointerException np)
		{
			System.out.println("Name is empty");
		}
		
		
		System.out.println("Print me after printing the  name length");
		

	}

}
