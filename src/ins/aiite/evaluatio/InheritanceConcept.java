package ins.aiite.evaluatio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class InheritanceConcept {
	
	public static void main(String[] args) {
		
		
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime dt=LocalDateTime.now();
		System.out.println(dt);		
		
		
	    LocalDateTime myDateObj = LocalDateTime.now();
	    System.out.println("Before formatting: " + myDateObj);
	    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");

	    String formattedDatetime = myDateObj.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDatetime);

	}

}
