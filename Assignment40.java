/* 
	"write a program for single level inheritance using a static and non static method in the 
	different class name in the single package explorer(ex:module 2 as package name)"
*/

package assignments.java;

class Parent40
{
	public static void method1()
	{
		System.out.println("Parent class static method");
	}
	
	void method2()
	{
		System.out.println("Parent class Non-static method");
	}
}

public class Assignment40 extends Parent40 {
	
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
		Assignment40 sc= new Assignment40();
		sc.method4();
		method1();
		sc.method2();
		
		

	}

}
