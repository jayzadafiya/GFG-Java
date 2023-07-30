package array;

import java.util.Scanner;

public class sort_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		
		for(int i=0;i<n;i++) {//i<a.length
		  a[i]=sc.nextInt();
		
		}
		
			if(isSort(a,n))
			{
			   System.out.println("it is sorted array");
			}
			else
			{
			   System.out.println("it is not sorted array");
			}
	

}
	public static boolean isSort(int []a,int n)
	{
		for(int i=1;i<n;i++)
		{
			if(a[i]<a[i-1])
			{
				return false;
			}
		}
				return true ;
			
		
	}
	
}