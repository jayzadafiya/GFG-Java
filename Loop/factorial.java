package Loop;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		while(a>0) {
			i = a*i;
			a--;
			
	   }
		System.out.println(i);


   }
}
