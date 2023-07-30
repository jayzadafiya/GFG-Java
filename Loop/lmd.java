package Loop;

import java.util.Scanner;

public class lmd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = Math.max(a, b);
		int y=a*b;
		int ans =x;
		for(int i=x;i<=y;i++)
		{
			if(i%a==0&&i%b==0)
			{
				ans=i;
				break;
				

			}
		}
		System.out.println(ans);

	}

}
