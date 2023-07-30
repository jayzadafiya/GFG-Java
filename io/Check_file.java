package io;

import java.io.File;

public  class Check_file {

	public static void main(String[] args) {

		try
		{
			File f = new File("G:\\Java\\GFG Java programs\\src\\io\\output.txt");
			if(f.createNewFile())
			{
				System.out.println(f.getName());
			}else
			{
				System.out.println("FIle already exist");
				System.out.println(f.getAbsolutePath());

			}
		}
		catch (Exception e)
		{
			System.out.println("error");
			
		}
	}

}
