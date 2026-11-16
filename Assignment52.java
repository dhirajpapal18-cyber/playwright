package assignments.java;
abstract class A1
{
	int a;
	float b=20.8f;
	final double c=30.40;
	abstract int add();
	float mul()
	{
		return a*b;
	}
}

abstract class A2 extends A1
{
	int a;
	float b=40.8f;
	final double c=40.40;
	abstract int sub();
	float div()
	{
		return a/b;
	}
}

public class Assignment52 extends A2 {
	int sub() {
		return a-a;
	}

	int add() {
		return a+a;
	}	
	public static void main(String[] args) {
		
		Assignment52 obj=new Assignment52();
		System.out.println(obj.mul());
		System.out.println(obj.div());
		System.out.println(obj.sub());
		System.out.println(obj.add());
	}
}


