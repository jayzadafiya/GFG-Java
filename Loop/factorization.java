package Loop;

import java.util.Scanner;

public class factorization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println(i);
				a=a/i;
				
			}
			
			
			
		}
		if(a>2)
		System.out.println(a);
	}

}
