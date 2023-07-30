package arraylist;

import java.util.ArrayList;

public class Add_in {

	public static void main(String[] args) {

		ArrayList <Integer> al = new ArrayList(); // (100) we can assign size here
		al.ensureCapacity(10); // all here we can assign size of array 
		
		// if we try to add data at index 101 then arraylist size is become double
		
		for (int i =0 ;i<15 ;i++)
		{
			al.add(i);
			System.out.println(al);
			
		}
	}

}
