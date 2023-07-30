package operator;

import java.util.Scanner;

public class N_sum {
	public static void main(String[] args)
	{
		System.out.println("Enter a number to find a sum");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char c = sc.next().charAt(0);
		int sum = n*(n+1)/2;
		
		System.err.println("Sum = "+sum);
		System.err.println(c);
	}

}
