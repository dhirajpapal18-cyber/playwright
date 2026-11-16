package assignments.java;
class Subject{
	public static void method1()
	{
		System.out.println("we have differnet types of subject :Static");
	}	
	public void method()
	{
		System.out.println("we have differnet types of subject : Non-Static");
	}
}


class English extends Subject{
	static void method2()
	{
		method1();
		English sc3= new English();
		sc3.method3();
		System.out.println("Static Method : English");
	}
	
	private void method3()
	{
		method();
		System.out.println("Non-Static Method : English");
	}
}

class Math1 extends Subject{
	static void method4()
	{
		method1();
		Math1 sc3= new Math1();
		sc3.method5();
		System.out.println("Static Method : Math");
	}
	
	private void method5()
	{
		method();
		System.out.println("Non-Static Method : Math");
	}
}


public class Assignment42 extends Subject {
	static void method4()
	{
		method1();
		System.out.println("Static Method : Science");
	}
	
	private void method5()
	{
		method();
		System.out.println("Non-Static Method : Science");
	}

	public static void main(String[] args) {
		
		Assignment42 sc= new Assignment42();
		sc.method5();
		method4();
		Math1.method4();
		English.method2();
		
		
		
		

	}

}
