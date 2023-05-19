package ins.aiite.arrays;



public class StringBuff {
	public static void main(String[] args) {
		
		StringBuffer sb= new StringBuffer("Aiite Academy");
		sb.insert(5," Java ");
		sb.append(", Chennai");
		sb.replace(6, 10, "Python");
		System.out.println(sb.indexOf(","));
		sb.deleteCharAt(sb.indexOf(","));
		//sb.delete(4, 7);		
		System.out.println(sb);		
		System.out.println(sb.reverse());
		
		StringBuilder sb1= new StringBuilder("Aiite Academy");
		sb1.insert(5," Java ");
		sb1.append(", Chennai");
		sb1.replace(6, 10, "Python");
		System.out.println(sb1.indexOf(","));
		sb1.deleteCharAt(sb.indexOf(","));
		//sb.delete(4, 7);		
		System.out.println(sb1);		
		System.out.println(sb1.reverse());
		int[] a= {1,2,3,4,5};
		
	}

}
