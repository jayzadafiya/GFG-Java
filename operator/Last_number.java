package operator;

import java.util.Scanner;

public class Last_number {

	public static void main(String[] args) {
		System.out.println("Enter a number to find a last digit  of it ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x= Math.abs(n);
		int y=x%10;
		System.out.printf("Last no %d is = %d",n,y);

	}

}
