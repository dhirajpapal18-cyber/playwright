package assignments.java;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Assignment100 {

	public static void main(String[] args) throws FileNotFoundException {
		// WAP on throw and throws keyword
		
		int num=10;
		if(num<100)
		{
			throw new NullPointerException();
		}
		
		FileReader f1= new FileReader("missingFile.txt");
		

	}

}
