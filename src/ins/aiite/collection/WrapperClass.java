package ins.aiite.collection;

public class WrapperClass {
	public static void main(String[] args) {
	    int a =10;  //normal variable
	    Integer a1 = new Integer(a);  // boxing(primitive to object)
	    int a2  = a1.intValue(); //unboxing
	    System.out.println("unboxing "+a2);
	      
	    
	    
	    int b = 20;
	    Integer b1 = b;   // auto-boxing(shortcut for boxing)
	    int b2 = b1; // auto-unboxing(shortcut for unboxing)
	    System.out.println("auto boxing "+b1);
	    	    
	    
	  //  int,char,boolean - primitive datatypes
	    //concerting primitive into wrapper class -boxing
	  //concerting wrapper class into primitive  - unboxing 
	    
	    
	   
	    

	}

}
