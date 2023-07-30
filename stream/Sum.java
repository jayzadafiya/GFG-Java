package stream;

import java.util.Arrays;

public class Sum {

	public static void main(String[] args) {
		int [] a = {30,20,10,15};
		int sum =Arrays.stream(a)
				.sum();
		System.out.println(sum);
	}

}
