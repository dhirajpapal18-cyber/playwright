package assignments.java;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Assignment99 {

	public static void main(String[] args) throws FileNotFoundException {
		try
		{
			int num=10/0;
			System.out.println(num);
		}
		catch(Exception e1)
		{
			System.out.println("Unchecked Exception found : " + e1);
		}
		
		try
		{
			FileReader f1= new FileReader("missingFile.txt");
			f1.close();
		}
		catch(Exception e2)
		{
			System.out.println("Checked Exception found : " +e2);
		}
		
		
	}

}
