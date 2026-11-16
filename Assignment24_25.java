package assignments.java;

public class Assignment24_25 {
	static int a=20;
	float b=30;
	
	void method1()
	{
		int c=30;
		float d=50;
		System.out.println("old value of local c is "+c +" and " + "old value of local d is " + d);
		
		c=80;
		d=90;
		
		System.out.println("new value of local c is "+c +" and " + "new value of local d is " + d);
		
		
	}
	public static void main(String[] args) {
		//  How to update the local and global variable?
		
		a=50;
		Assignment24_25 obj=new Assignment24_25();
		obj.b=70;                                       //updated global variables
		obj.method1();

		

	}

}
