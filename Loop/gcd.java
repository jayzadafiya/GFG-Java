package Loop;
//greatest common divisor number

import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = Math.min(a, b);
		int x=1;
		for(int i=1;i<=n;i++)
		{
			if(a%i==0&&b%i==0)
			{
				x=i;
				
				

			}
		}
		System.out.println(x);
		
		
	}

}
