package ins.aiite.exceptionHandling;

public class MyExceptionService {

	public void doSomething() throws MyException {
	  int a=10;
	  int b=0;
	    if (b==0) {
	      throw new MyException("Trying to divide by zero");
	    }
	  }
	

}
