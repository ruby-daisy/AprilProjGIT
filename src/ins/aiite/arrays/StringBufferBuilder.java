package ins.aiite.arrays;

public class StringBufferBuilder {

	public static void main(String[] args) {

		// insert()
		// append()
		// replace()
		//delete()
		//deleteCharAt()
		//reverse()
	long startTime=System.currentTimeMillis();
	for(int i=0;i<500000;i++)
	{
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		sb.insert(0, "Hi!");
		System.out.println(sb);
		sb.append(" How Are You");
		System.out.println(sb);
		sb.append(false);
		System.out.println(sb);
		sb.append(25);
		System.out.println(sb);
		sb.insert(7, "Daisy");
		System.out.println(sb);
		
	}
	long endTime=System.currentTimeMillis();
	
	
	long startTime1=System.currentTimeMillis();
	for(int i=0;i<50000;i++)
	{
		StringBuilder sd = new StringBuilder("Hello");
		System.out.println(sd);
		sd.insert(0, "Hi!");
		System.out.println(sd);
		sd.append(" How Are You");
		System.out.println(sd);
		sd.append(false);
		System.out.println(sd);
		sd.append(25);
		System.out.println(sd);
		sd.insert(7, "Daisy");
		System.out.println(sd);
	}
	long endTime1=System.currentTimeMillis();
	System.out.println("Time taken by buffer" + (endTime-startTime)+ " ms");
	System.out.println("Time taken by builder" + (endTime1-startTime1)+ " ms");
		
		
		
//		StringBuffer sb1 = new StringBuffer("Aiite Academy");
//		sb1.replace(0, 5, "AIITE");
//		System.out.println(sb1);
//		sb1.deleteCharAt(4);
//		System.out.println(sb1);
//		sb1.delete(6, 13);
//		System.out.println(sb1);		
//		StringBuffer sb2 = new StringBuffer("Aiite Academy");
//		sb2.reverse();
//		System.out.println(sb2);		
//		System.out.println(sb2.capacity());
	}

}
