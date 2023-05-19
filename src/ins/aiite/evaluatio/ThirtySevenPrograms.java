package ins.aiite.evaluatio;

public class ThirtySevenPrograms {
	public static void main(String[] args) {

		String name = "God! is Good All The Time!";
		String[] sh = name.split(" ");
		for (int i = sh.length - 1; i >= 0; i--) {
			System.out.println(sh[i]);
		}
		for (String a : sh)
			System.out.println(a);
		
		
		boolean alphabetic = Character.isDigit(name.charAt(3));
		System.out.println(name.charAt(3) + "is Alphabetic? " + alphabetic);
	}

}
