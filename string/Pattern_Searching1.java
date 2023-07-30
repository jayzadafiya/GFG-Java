package string;

public class Pattern_Searching1 {

	public static void main(String[] args) {
		
		String s1= "jay zadafiya";
		String pet = "a";
		
		search(s1,pet);

	}
	public static void search (String s , String pet)
	{
		int position =s.indexOf(pet);
		while (position >=0)
		{
			System.out.println(position+" ");
			position=(s.indexOf(pet, position+1));
		}
	}

}
