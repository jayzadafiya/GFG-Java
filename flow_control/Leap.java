package flow_control;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
				
		if(year%4==0&&year%100!=0)
		{
			System.out.println("yes,it is leap year");
		}
		else if (year%400==0)
		{
			System.out.println("yes,it is leap year"); 	
		}
		else
		{
			System.out.println("no,it is not a leap year");
		}
		
    

	}

}
