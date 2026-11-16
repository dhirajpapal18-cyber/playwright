

package assignments.java;

public class Assignment11 {
	
	Assignment11()
	{
		System.out.println("constructor 1");
	}
	
	Assignment11(int a)
	{
		System.out.println("constructor 2");
	}
	
	Assignment11(float b)
	{
		System.out.println("constructor 3");
	}
	
	Assignment11(String c)
	{
		System.out.println("constructor 4");
	}

	public static void main(String[] args) {
		// Write a program on Constructor overloading
		
		new Assignment11();
		new Assignment11(2);
		new Assignment11(4.2f);
		new Assignment11("text");
		
	}

}
