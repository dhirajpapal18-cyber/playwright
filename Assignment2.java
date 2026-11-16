package assignments.java;

public class Assignment2 {
	public static void add()
	{
		System.out.println("Static 1");
	}
	
	 static void sub()
	{
		System.out.println("Static 2");
	}
	
	protected static void div()
	{
		System.out.println("Static 3");
	}
	
	private static void mul()
	{
		System.out.println("Static 4");
	}

	public static void main(String[] args) {
		// WAP to have 4 static methods and call them inside the main method
		
		add();
		sub();
		div();
		mul();

	}

}
