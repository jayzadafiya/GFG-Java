package flow_control;

import java.util.Scanner;

public class Large3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c =	sc.nextInt();
		
		if(a>=b&&a>=c)
		{
			System.out.println(a);
		}
		else if (b>=a&&b>=c)
		{
			System.err.println(b); 	
		}
		else
		{
			System.err.println(c);
		}
		
		int a1=Math.max(a,b);
		int a2 = Math.max(a1, c);
		System.err.println(a2);

	}

}
