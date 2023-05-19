package ins.aiite.exceptionHandling;
import java.io.IOException;
import java.sql.SQLException;

public class MyService {
	 public void doSomething() throws IOException, SQLException, ArithmeticException{
		    int div=10/0;
	  }

}
