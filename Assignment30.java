package assignments.java;

public class Assignment30 {
	
	int a= 10;
	
	static void method1()
	{
		int a=20;
		System.out.println(a);
	}
	
	void method2()
	{
		int a=30;
		System.out.println(a);
	}

	public static void main(String[] args) {
		/* 
		 Write a program where the same variable name is used locally and globally, 
		 and access both from the main() method.
		 */
		Assignment30 sc= new Assignment30();
		System.out.println(sc.a);
		
		method1();
		sc.method2();
	}

}
