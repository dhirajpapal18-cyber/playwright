package assignments.java;

public class Assignment39 {
	Assignment39()
	{
		this(12);
		System.out.println("Constuctor 1");
	}
	
	Assignment39(int a)
	{
		this(12,23.45f);
		System.out.println("Constuctor 2");
	}
	
	Assignment39(int a, float b)
	{
		this(34.43f);
		System.out.println("Constuctor 3");
	}
	
	Assignment39(float b)
	{
		this(23.32f,34);
		System.out.println("Constuctor 4");
	}
	
	Assignment39(float a, int b)
	{
		this("text");
		System.out.println("Constuctor 5");
	}
	
	Assignment39(String a)
	{
		System.out.println("Constuctor 6");
	}

	public static void main(String[] args) {
		//write a program on constructor chaining using this calling statement
		new Assignment39();
		

	}

}
