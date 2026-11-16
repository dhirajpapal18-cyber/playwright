/*
 Write a program to demonstrate super calling statement using both parameterized 
 and non-parameterized constructors in multilevel inheritance.
 */
package assignments.java;

class Parent44
{
	Parent44()
	{
		System.out.println("Constructor 1");
	}
	
	Parent44(int a)
	{
		System.out.println("Constructor 2");
	}
}

class ChildParent44 extends Parent44
{
	ChildParent44()
	{
		super(12);
		System.out.println("Constructor 3");
	}
	
	ChildParent44(float b)
	{
		System.out.println("Constructor 4");
	}
}

public class Assignment44 extends ChildParent44 {
	
	Assignment44()
	{
		super(23.5f);
		System.out.println("Constructor 5");
	}
	
	Assignment44(String c)
	{
		System.out.println("Constructor 6");
	}

	public static void main(String[] args) {
		
		new Assignment44("text");
		new Assignment44("");
		
	

	}

}
