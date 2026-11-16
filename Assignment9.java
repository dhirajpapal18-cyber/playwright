package assignments.java;

public class Assignment9 {
	
	public void myMethod()
	{
		System.out.println("Non static method - 0 Parameter");
	}
	
	protected void myMethod(int a)
	{
		System.out.println("Non static method - 1 Parameter");
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
		// WAP to demonstrate non-Static Method Overloading in Java.
		
		Assignment9 obj= new Assignment9();
		obj.myMethod();
		obj.myMethod(5);
		obj.myMethod(4.5f, 7);
		obj.myMethod("text", 45.67, (byte) 200);

	}

}
