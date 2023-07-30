package io;
import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class Read_Write {

	public static void main(String[] args) {

		try
		{
		File f= new File("G:\\Java\\GFG Java programs\\src\\io\\read.txt");
		FileWriter wr = new FileWriter("G:\\Java\\GFG Java programs\\src\\io\\read.txt");

		f.createNewFile();
		Scanner s = new Scanner(System.in);
		Scanner sc = new Scanner (f);
		
		
		//write
		System.out.println("Enter a data in file");
		String d = s.nextLine();
		wr.write(d);
		wr.close();
		
		System.out.println("file data :");
		
		//read data
		while(sc.hasNextLine())
		{
			String  data= sc.nextLine();
			System.out.print(data);
		}
		sc.close();

		}
		catch (Exception e)
		{
			System.out.println("error"+e);
		}
		
	}

}
