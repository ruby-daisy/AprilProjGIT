package ins.aiite.collection;

public class CollectionEnum {
	 enum Day {
	        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	    }

	public static void main(String[] args) {
		
        for (Day d : Day.values()) {
           
            System.out.println(d.name() + " is day number " + d.ordinal());
        }

       
        Day wed = Day.valueOf("WEDNESDAY");
        System.out.println("Wednesday is day number " + wed.ordinal());
    }

	}


