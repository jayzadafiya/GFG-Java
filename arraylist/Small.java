package arraylist;

import java.util.*;

public class Small {

	public static void main(String[] args) {

		int n, i;

		System.out.println("enter a size of ArrayList");

		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] a = new int[n];

		System.out.println("Enter a data of ArrayList");

		for (i = 0; i < n; i++) {
			a[i] = sc.nextInt();

		}

		System.out.println("enter a number for finding smaller list");
		int x = sc.nextInt();

		ArrayList<Integer> ans = smaller(a, x);
		for ( i =0 ;i<ans.size();i++)
		{
			System.out.print(ans.get(i)+" ");
		}

	}

	public static ArrayList<Integer> smaller(int[] a, int redix) {
		ArrayList ans = new ArrayList();
		for (int i = 0; i < a.length; i++) {
			if (a[i] < redix) {
				ans.add(a[i]);

			}
		}
		return ans;

	}

}
