package ins.aiite.exceptionHandling;

import java.io.FileInputStream;

public class FileNotFoundException {
	
	

	public static void main(String[] args) {
		
		
		try {
			
			Class.forName("exe.class");
			FileInputStream fis=new FileInputStream("xxx.txt");	
			
		} 
		
		catch (java.io.FileNotFoundException | ClassNotFoundException e) {
			System.out.println("File Not Found");
			System.out.println(e);
		}
		System.out.println("After file code");
		
		
		

	}

}
