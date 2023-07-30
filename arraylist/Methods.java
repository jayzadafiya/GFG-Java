package arraylist;

import java.util.ArrayList;

public class Methods {

	public static void main(String[] args) {

		ArrayList <Integer> a = new ArrayList ();
		a.add(10);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		a.add(1,11);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.contains(12));
		
		
		System.out.println(a.remove(2));
		a.remove(2);
		System.out.println(a.contains(13));
		System.out.println(a);
		
		System.out.println(a.get(2));
		a.set(2,16);
		System.out.println(a);

		System.out.println(a.lastIndexOf(16));



		
		
		
		
	}

}
