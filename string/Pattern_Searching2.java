package string;

public class Pattern_Searching2 {

	public static void main(String[] args) {
		
		String s1="12.34567";
		
		String x = search(s1);

		System.out.println(x);
	}
	
	public static String search (String s)
	{
		int position = s.indexOf('.');
		if(position <0)
		{
			return"false, number has not any decimal number";
		}
		else
		{
			return s.substring(position+1);
		}
	}

}
