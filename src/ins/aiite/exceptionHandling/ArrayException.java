package ins.aiite.exceptionHandling;

public class ArrayException {

	public static void main(String[] args) {
		int[] arr=new int[3];		
		try
		{
			arr[0]=81;
			arr[1]=233;
			arr[2]=54;
			arr[3]=12;
			
			
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("index error");
		}
		for (int i : arr) {
			System.out.println(i);
			
		}
		

	}

}
