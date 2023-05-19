package ins.aiite.exceptionExample;

public class NestedTry 
{
	public static void main(String[] args) {		
	
	try 
	{		
		try {
		
		int[] arr = {1, 2, 3};
		System.out.println(arr[3]); 
		} 
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index out of bounds");
		}
	int num = Integer.parseInt("abc"); 
	}
	catch (NumberFormatException e)
	{
		System.out.println("Number format exception");
	}
}
}
