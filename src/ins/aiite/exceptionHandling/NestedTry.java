package ins.aiite.exceptionHandling;

public class NestedTry {

	public static void main(String[] args) {
		try {
			  // outer try block
			  try {
			    // inner try block
			    int[] arr = {1, 2, 3};
			    System.out.println(arr[3]); // will throw an ArrayIndexOutOfBoundsException
			  } catch (ArrayIndexOutOfBoundsException e) {
			    System.out.println("Array index out of bounds");
			  }
			  
			  int num = Integer.parseInt("abc"); // will throw a NumberFormatException
			} catch (NumberFormatException e) {
			  System.out.println("Number format exception");
			}

	}

}
