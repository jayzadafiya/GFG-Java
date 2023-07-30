package opp;

public class encapsulation {

	// encapsulation is binding dat5a with method

	// package encapsulation ;
	public static void main(String[] args) {
		encapsulation a = new encapsulation();

		try {
			Emp e = new Emp();
			e.setId(1);
			System.out.println(e.getId());

			e.setName("jay");
			System.out.println(e.getName());

			a.Dowork();
		} catch (Exception e) {
			System.out.println("error");
		}

	}

	public void Dowork() // if we make this method as static than we can directly
	                         //access it otherwise we
							// have to make class object then we can access it
	{
		System.out.println("it  gggg is in wapper file");
	}

}

class Emp {
	private int id; // outside class can not access directly
	protected String name;

	public int getId() {

		System.out.println("User is change ID");
		return id;
	}

	public void setId(int id) {
		System.out.println("User add ID input");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
