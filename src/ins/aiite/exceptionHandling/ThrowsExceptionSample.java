package ins.aiite.exceptionHandling;

import java.io.IOException;
import java.sql.SQLException;

public class ThrowsExceptionSample {

	public static void main(String[] args) {
		MyService service = new MyService();
		try {

			service.doSomething();
			

		} catch (IOException e) {
			System.err.println("Error: " + e.getMessage());
		} catch (SQLException e) {
			System.err.println("Error: " + e.getMessage());
		} catch (ArithmeticException e) {
			System.err.println("Error: " + e.getMessage());
		}
		System.out.println("ruby");
	}

}
