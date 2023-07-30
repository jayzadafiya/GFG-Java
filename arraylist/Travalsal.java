/*
 * get
 * for each loop
 * itrator
 * for each method
 */

package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Travalsal {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList();
		a.add(10);
		a.add(12);
		a.add(15);

//	for(int i =0;i<a.size();i++)
//	{
//		System.out.println(a.get(i));
//		
//		
//	}

//	for (int k :a)
//	{
//		System.out.println(k);
//	}

//		Iterator<Integer> ir = a.iterator();
//		while (ir.hasNext()) {
//
//			System.out.println(ir.next()+ " ");
//		}
		
		//remove data while removing data
		a.add(5);
//		Iterator<Integer> ir = a.iterator();
//		while (ir.hasNext()) {
//           	int x = ir.next();
//
//			if(x<10)
//			System.out.println(ir.next()+ " ");
//			else
//				System.out.println(x);
//		}
		// for each method
		a.forEach(x->System.out.println(x));
	}

}
