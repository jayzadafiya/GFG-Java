package array;

import java.util.Scanner;

public class count_distinct {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int []a = new int[n];
			
			
			for(int i=0;i<n;i++) {//i<a.length
			  a[i]=sc.nextInt();
			  System.out.println(i+" "+a[i]);
			
			}
			
				
				   System.out.println(count(a,n));
				
		

	}
		public static int count(int []a,int n)
		{ 
			int c = 0,ans=1;
			for(int i=0;i<n;i++)
			{
				for(int j =(i-1);j>=0;j--)
				{
				if(a[i]==a[j])
				{
					ans=0;
					break;
			
				}
				}
				
				if(ans ==1)
				{
					c++;
				}
				ans=1;
				
				
				
			}
					
				return c;
			
		}


}
