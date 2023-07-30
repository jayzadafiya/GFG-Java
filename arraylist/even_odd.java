package arraylist;

import java.util.*;

public class even_odd {

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

		get_odd_even(a);
	}

	public static void get_odd_even(int a[]) {
		int i;
		ArrayList<Integer> even = new ArrayList();
		ArrayList<Integer> odd = new ArrayList();

		for (i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even.add(a[i]);
			} else {
				odd.add(a[i]);
			}
		}

		System.out.print("even numbers : ");
		for (i = 0; i < even.size(); i++) {

			System.out.print(even.get(i) + " ");
		}

		System.out.println("\n");
		System.out.print("odd numbers : ");
		for (i = 0; i < odd.size(); i++) {

			System.out.print(odd.get(i) + " ");
		}
	}

}
