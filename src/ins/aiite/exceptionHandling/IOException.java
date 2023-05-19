package ins.aiite.exceptionHandling;

import java.io.FileWriter;

public class IOException {

	public static void main(String[] args) {
		
		
		
	try {
		FileWriter file=new FileWriter("abx.txt");
	} 
	catch (java.io.IOException e) {
		
		e.printStackTrace();
	}	
			
		
		
	}

}
