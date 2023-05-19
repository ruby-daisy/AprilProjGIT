package ins.aiite.collection;

public class TypeCasting {

	public static void main(String[] args) {
		
		// phone number is received as a string but we need to change it to number to validate it
	String ph="98";
	int p=Integer.parseInt(ph);//classname.method()
	
	System.out.println(p);	
	String month= "November";
	int regNo=12;	
	String temp=String.valueOf(regNo);	
	String stID=month+temp;
	System.out.println(stID);
	
	
	
	
	
	
	
	}

}
