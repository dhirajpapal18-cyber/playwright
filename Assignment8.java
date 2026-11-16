package assignments.java;

public class Assignment8 {
	
	
	public static void myMethod()
	{
		System.out.println("0 Parameter");
	}
	
	public static void myMethod(int a)
	{
		System.out.println("1 Parameter");
	}
	
	public static void myMethod(float b, int d)
	{
		System.out.println("2 Parameter");
	}
	
	public static void myMethod(String c, double e, byte f)
	{
		System.out.println("3 Parameter");
	}

	public static void main(String[] args) {
		// WAP to demonstrate Static Method Overloading in Java.
		
		myMethod();
		myMethod(5);
		myMethod(4.5f, 7);
		myMethod("text", 45.67, (byte) 200);
		
	}

}
