package assignments.java;

public class Assignment7 {
	
	Assignment7(int a)
	{
		System.out.println("Constructor");
	}
	
	static void method1(float b)
	{
		System.out.println("method 1");
	}
	
	public void method2(String c)
	{
		System.out.println("method 2");
	}


	public static void main(String[] args) {
		/* 
		 WAP to demonstrate a parameterized constructor, 
		 a parameterized  static method, and a parameterized  non-static method.
		 */
		
		Assignment7 obj1= new Assignment7(5);
		method1(5.5f);
		obj1.method2("text");
		
	}

}
