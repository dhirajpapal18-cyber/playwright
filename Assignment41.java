/* 
write a program for multilevel inheritance using a static and non static method in the 
different class name in the single package explorer(ex:module 2 as package name)"
*/

package assignments.java;


class Parents41
{
	public static void method5()
	{
		System.out.println("Parent class static method");
	}
	
	void method6()
	{
		System.out.println("Parent class Non-static method");
	}
}

class ChildParent40 extends Parents41
{
	public static void method1()
	{
		System.out.println("Child-Parent class static method");
	}
	
	void method2()
	{
		System.out.println("Child-Parent class Non-static method");
	}
}



public class Assignment41 extends ChildParent40 {
	private static void method3()
	{
		System.out.println("Child class static method");
	}
	
	protected void method4()
	{
		System.out.println("Child class Non-static method");
	}

	public static void main(String[] args) {
		
		method3();
		Assignment41 sc= new Assignment41();
		sc.method4();
		method1();
		sc.method2();
		method5();
		sc.method6();

	}

}
