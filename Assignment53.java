package assignments.java;
interface I1
{
	int a=10;
	float b=20.34f;
	void add();
	void sub();
}

abstract class A11 implements I1
{
	int c=20;
	abstract void div();
	void mul()
	{
		System.out.println("Multiplication");
	}
}
public class Assignment53 extends A11 {
	public void add() {
		System.out.println("add");
	}

	public void sub() {
		System.out.println("sub");
	}

	void div() {
		System.out.println("div");
	}
	public static void main(String[] args) {
		Assignment53 obj= new Assignment53();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		System.out.println(I1.a);
		System.out.println(I1.b);
		System.out.println(obj.c);
		
	}



}
