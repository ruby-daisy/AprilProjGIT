package ins.aiite.exceptionHandling;

public class ExplicitThrow {

	public static void div(int a, int b) {
		try {
			if (a == 0 || b == 0) {
				throw new ArithmeticException("Cant divide by zero");
			} else
				System.out.println(a/b);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		div(12, 0);
	}

}
