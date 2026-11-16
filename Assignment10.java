package assignments.java;

public class Assignment10 {
	
	public static void myMethod()
	{
		System.out.println("static method - 0 Parameter");
	}
	
	protected static void myMethod(int a)
	{
		System.out.println("static method - 1 Parameter");
	}
	
	private void myMethod(float b, int d)
	{
		System.out.println("Non static method - 2 Parameter");
	}
	
	 void myMethod(String c, double e, byte f)
	{
		System.out.println("Non static method - 3 Parameter");
	}

	public static void main(String[] args) {
		/* 
		 Write a Java program to demonstrate method overloading using two static methods 
		 and two non-static methods within a single class.
		 */
		
		myMethod();
		myMethod(12);
		Assignment10 obj= new Assignment10();
		obj.myMethod(3.5f, 5);
		obj.myMethod("text", 22.33, (byte) 20);

	}

}
