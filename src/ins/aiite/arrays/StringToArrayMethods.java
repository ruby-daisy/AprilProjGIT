package ins.aiite.arrays;

public class StringToArrayMethods {

	public static void main(String[] args) {

		// toCharArray()
		// split()
		String str = "Good Morning and Welcome to the Class";
		char[] ch = str.toCharArray();
		for (char c : ch) {
			System.out.println(c);

		}
		
		String[] st=str.split(" ");
		for (String sp_str : st) {
			System.out.println(sp_str);
		}
		
		
		for (int i=st.length-1;i>=0;i--)
		{
		System.out.println(st[i]);
		}

	}

}
