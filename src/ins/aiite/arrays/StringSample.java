package ins.aiite.arrays;

import java.util.Scanner;

public class StringSample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = "Java Programming";
		String s2 = s1.replace("Java", "Python");
		String s3 = s1.replace('a', '#');
		System.out.println(s3);

		String a;
		System.out.println("Enter the string to reverese");
		a = sc.nextLine();
		char[] ch = a.toCharArray();
		for (char c : ch) {
			System.out.println(c);
		}
		// print reverse
		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);
		}

		String[] str = a.split(" ");
		for (String str1 : str) {
			System.out.println(str1);
		}
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		// print reverse
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);
		}
	}

}
