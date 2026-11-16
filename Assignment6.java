package assignments.java;

public class Assignment6 {
	
	Assignment6()
	{
		System.out.println("Constructor");
	}
	
	static void method1()
	{
		System.out.println("method 1");
	}
	
	public void method2()
	{
		System.out.println("method 2");
	}


	public static void main(String[] args) {
		/* 
		   WAP to demonstrate a non-parameterized constructor, 
		   a non-parameterized static method, and a non-parameterized non-static method.
		 */
		
		method1();
		Assignment6 obj1 = new Assignment6();
		obj1.method2();

	}

}
