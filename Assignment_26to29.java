/*  
	How to access the static global variable of a different class?	
	How to access the non static global variable of a different class?	
	Write a program to demonstrate a final variable and try to update it.	
	Write a program to access static and non-static global variables from static and non-static methods.
*/

package assignments.java;

class Parentclass
{
	public static int a= 10;
	public float b= 20.3f;
}

public class Assignment_26to29 {
	public static int a= 20;
	public float b= 40.6f;
	final public double d= 34.65;
	
	
	static void method1()
	{
		System.out.println(a);
		Assignment_26to29 obj = new Assignment_26to29();
		System.out.println(obj.b);
	}
	
	void method2()
	{
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		System.out.println(Parentclass.a);
		Parentclass sc= new Parentclass();
		System.out.println(sc.b);
		
		System.out.println(a);
		Assignment_26to29 sc2= new Assignment_26to29();
		System.out.println(sc2.b);
		
		System.out.println(sc2.d);
		//sc2.d=40.50; //error >> The final field Assignment_26to29.d cannot be assigned
		
		System.out.println("accessing static and non-static global variables from static and non-static methods. ");
		method1();
		sc2.method2();
	}

}
