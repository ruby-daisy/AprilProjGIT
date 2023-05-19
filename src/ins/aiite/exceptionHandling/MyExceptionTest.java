package ins.aiite.exceptionHandling;

public class MyExceptionTest {

	public static void main(String[] args) {
		MyExceptionService service = new MyExceptionService();
	    try {
	      service.doSomething();
	    } catch (MyException e) {
	      System.err.println("Error: " + e.getMessage());
	    }

	}

}
