/* given string is pangaram if it contain a to z alphabet whater thet all are in upper case or lowercase*/

package string;

public class Pangram_checking {

	public static void main(String[] args) {

		String s1 = "the quick brown fox jumps over the lazy dog ";

		boolean a = pangaram(s1);

		if (a == true) {
			System.out.printf("Given String \"%s\" \nis pangaram", s1);
		} else {
			System.out.printf("Given String %s \nis not pangaram", s1);

		}
	}

	public static boolean pangaram(String s) {
		int n, i;
		n = s.length();
		try {
			boolean[] visited = new boolean[26];
			for (i = 0; i < 26; i++) {
				char x = s.charAt(i);
				if (x >= 'a' && x <= 'z') {
					visited[x - 'a'] = true;
				}
				if (x >= 'A' && x <= 'Z') {
					visited[x - 'A'] = true; // id x is A then ascii value of A is 65 then 65-65=0 then at index 0 array
												// store true value

				}

				for (i = 0; i < 26; i++) {
					if (visited[i] = false) {
						return false;
					}
				}
			}
		} catch (Exception e) {
			System.out.println("error" + e);
		}
		return true;

	}

}
