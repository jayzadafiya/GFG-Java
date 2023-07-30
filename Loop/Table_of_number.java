package Loop;

import java.util.Scanner;

public class Table_of_number {

	public static void main(String[] args) {
	
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int i=1;
			while(i<11) {
				int  n = a*i;
				System.out.println(n);
				i++;

			}
			
	}

}
