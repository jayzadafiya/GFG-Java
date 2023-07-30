package biginteger;

import java.util.*;
import java.math.*;

public class Fabonacci {

	public static void main(String[] args) {

	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a number for fibonacci ");
		int n = sc.nextInt();
		
		System.out.println("\n"+fib(n));
	}

	public static BigInteger fib(int n )
	{
		BigInteger a= BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);
		BigInteger c = BigInteger.valueOf(0);
		System.out.print(c +" "+ b+" ");

		for(int i = 2 ; i<n;i++)
		{
			c=a.add(b);
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		return b;
	}
}
