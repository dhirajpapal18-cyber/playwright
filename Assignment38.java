package assignments.java;

public class Assignment38 {
	public static int a=10;
	int b= 25;
	
	
	void method1() 
	{
		int a=20;
		int b=56;
		
		System.out.println("Local variable a : " +a);
		System.out.println("Local variable b : " +b);
		System.out.println("Global variable a : " +this.a);
		System.out.println("Global variable b : " +this.b);
		
	}

	public static void main(String[] args) {
		Assignment38 sc= new Assignment38();
		sc.method1();

	}

}
