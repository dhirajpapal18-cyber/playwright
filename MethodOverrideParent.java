package assignments.java;

public class MethodOverrideParent {
	public int a=10;
	int b=20;
	private int c=30;
	protected int d= 50;
	
	// static variables
	public static float e=10.12f;
	static float f=20.13f;
	private static float g=30.32f;
	protected static float h= 50.14f;
	
	
	
	public static void Test1()
	{
		System.out.println("Static method of parent class");
	}
	
	static void Test2()
	{
		System.out.println("Default - Static method of parent class");
	}
	
	
	protected static void Test3()
	{
		System.out.println("protected - Static method of parent class");
	}
	
	
	private static void Test4()
	{
		System.out.println("Private - Static method of parent class");
	}
	
	
	// Non static methods below
	
	public void Test5()
	{
		System.out.println("Non Static method of parent class");
	}
	
	void Test6()
	{
		System.out.println("Default - Non Static method of parent class");
	}
	
	
	protected void Test7()
	{
		System.out.println("protected - Non Static method of parent class");
	}
	
	
	private void Test8()
	{
		System.out.println("Private - Non Static method of parent class");
	}
	
	
	
	public static void main(String[] args) {
		MethodOverrideParent obj=new MethodOverrideParent();
		System.out.println("**non static variables**");
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		
		System.out.println("**static variables**");
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		System.out.println("**static method**");
	    Test1();
	    Test2();
	    Test3();
	    Test4();
	    
		System.out.println("**non static method**");
		obj.Test5();
		obj.Test6();
		obj.Test7();
		obj.Test8();
		
		
	}

}
