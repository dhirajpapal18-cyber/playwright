package assignments.java;

public class Assignment23 {
	static int a=10;             //Global variable
	float b=20f;                 //Instance variable
	
	
	
	public void method1()
	{
		int c= 40;    
		System.out.println(c);//Local variable
	}

	public static void main(String[] args) {
		/*
		 Write a program on global variable and local variable
		 */
		
		System.out.println(a);
		Assignment23 obj=new Assignment23();
		System.out.println(obj.b);
		Assignment23 obj2=new Assignment23();
		obj2.method1();
		
		
		
		
		
	}

}
