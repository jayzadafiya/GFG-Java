package operator;

import java.util.Scanner;

public class n_find {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Today Day number");
		int d = sc.nextInt();
		System.out.println("Enter a finding Day number");
		int n = sc.nextInt();
		int x= n%7;
		int y =d-x;
		if(y>0)
		{
			System.out.println(y);
		}
		else
			System.out.println(y+7);

	}

}
