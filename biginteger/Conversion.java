package biginteger;
import java.math.*;
import java.util.*;


public class Conversion {

	public static void main(String[] args) {
 
		BigInteger a= new BigInteger ("100");  // it take string value
		
		String s = "125";
		BigInteger b = new BigInteger (s);
		
		
		int c = 100;
		BigInteger z = BigInteger.valueOf( c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(z);

		
		int x = a.intValue();
		String y = a.toString();
		
		System.out.println(x);
		System.out.println(y);
		
		BigInteger d= a.add(b); // Multiply sub div comparison remainder
		System.out.println(d);
		
		
		// comparison a.compareto(b) a>b =1 , a<b = -1 , a=b = 0
		


	}

}
