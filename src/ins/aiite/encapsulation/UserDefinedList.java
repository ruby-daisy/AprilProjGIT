package ins.aiite.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class UserDefinedList {
	
	public static void main(String[] args) {
		Student ruby=new Student();
		ruby.setMark(250);		
		Student daisy=new Student();		
		daisy.setMark(100);
		Student s3=new Student();		
		s3.setMark(200);
		
		
		List<Student> markList=new ArrayList<>();
		markList.add(ruby);
		markList.add(daisy);
		markList.add(s3);
		
		for (Student student : markList) {
			System.out.println(student.getMark());
			
		}
		
		
		
		
		
	}
	
	
	
	
	

}
