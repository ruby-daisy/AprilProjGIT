package ins.aiite.typeCasting;

public class NarrowCasting {

	public static void main(String[] args) {
	      double d = 10099993333.2d; 
	      System.out.println(d);
	      float f = (float) d;
	      System.out.println(f);
	      long l = (long) f; 
	      System.out.println(l);
	      int i = (int) l; 
	      System.out.println(i);
	      short s = (short) i; 
	      System.out.println(s);
	      byte b = (byte) s; 
	      System.out.println(b); 
	   // double -> float -> long -> int -> short -> byte

	}

}
