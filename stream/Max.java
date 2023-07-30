//gfg advance 11 video
package stream;

import java.util.Arrays;

public class Max {

	public static void main(String[] args) {
		int [] a = {30,20,10,15};
		int max =Arrays.stream(a)
				.max()
				.getAsInt();
		double avg =Arrays.stream(a)
				.average()
				.getAsDouble();
				
		System.out.println(max);
		System.out.println(avg);

	}

}
