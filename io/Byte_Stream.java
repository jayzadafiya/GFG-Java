package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Byte_Stream {

	public static void main(String[] args) throws Exception {

		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			in =new FileInputStream("input.txt");
			out = new FileOutputStream("output.txt");
			int c;
			
			// copy data file one to another file
			while((c=in.read())!=-1) // c is equal to -1 in which in file all data is readed 
			{
				out.write(c);
			}
		}
		finally
		{
			if(in!=null)
			{
				in.close();
			}
			if(out!=null)
			{
				out.close();
			}
			
		}
	}

}
