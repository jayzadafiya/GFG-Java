package stream;

import java.util.Arrays;
import java.util.List;

public class even {
	public static void main (String [] args)
	{
		List<Integer> a= Arrays.asList(10,40,20,30,75);
		a.stream()
		.filter(x->x%2==0)   // filter array
		.filter(x->x>10)
		.forEach(System.out::println);  // stream terminated here   //System.out::println is called as method reference 
		//System.out::println = x->System.out.prinln()  lambda exprection
	}

}
