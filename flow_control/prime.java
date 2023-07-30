package flow_control;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				System.out.println("no,it's not a prime number");
				count++;
				break;
				
			}
			
		}
		if(count==0)
		System.out.println("yes,it's a prime number");


	}

}
