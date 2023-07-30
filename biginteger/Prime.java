package biginteger;
import java.util.*;
import java.math.*;

public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a nummber ");
		int n = sc.nextInt();
		
		if(isPrime(n))
		{
		System.out.println("given number is prime number");
		System.out.println("A next prime number is :"+nextprime( n));
		}
		else
		{
			System.out.println("Given nummber is not prime nummber");
		}
	}

	public static boolean isPrime(int n )
	{
		BigInteger a = BigInteger.valueOf(n);
		return a.isProbablePrime(n);
		
	}
	public static int nextprime(int n)
	{
		BigInteger b = BigInteger.valueOf(n);
		int a=b.nextProbablePrime().intValue();
		return a;
	}
}
