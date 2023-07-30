package string;

public class Buffer_builder_methods {

	public static void main(String[] args) {

		StringBuffer s1 = new StringBuffer("abcd");
		System.out.println(s1);
		s1.reverse();
		System.out.println(s1);
		s1.append("ef");
		System.out.println(s1);
		s1.delete(0, 2);
		System.out.println(s1);
		s1.insert(1, "dc");
		System.out.println(s1);
	}

}
