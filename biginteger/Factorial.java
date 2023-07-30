package biginteger;
import java.util.*;
import java.math.*;

public class Factorial {

	public static void main(String[] args) {

		Scanner  sc = new Scanner (System.in);
		System.out.println("Enter a number to find upto factorial number");
		int n = sc.nextInt();
		
		System.out.println (factorial_count(n));
	}
	public static BigInteger factorial_count(int n)
	{
		BigInteger f = new BigInteger ("1");  // int f =1
		
		for (int i =2; i<=n;i++)
		{
			BigInteger x = BigInteger.valueOf(i); // int x =i
			f= f.multiply(x);    // f=f*x;
			
		}
		return f;
		
	}

}
