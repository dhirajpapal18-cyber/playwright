package assignments.java;



public class Assignment3 {
	public static void method1()
	{
		System.out.println("First method");
	}
	
	static void method2()
	{
		System.out.println("Second method");
		method1();
	}

	public static void main(String[] args) {
		// WAP on how to  call any static method inside any other static method inside the same class
		
		method2();

	}

}
