package assignments.java;

class MainClass
{
	MainClass()
	{
		System.out.println("main class constructor");
	}
}

public class Assignment46 extends MainClass{
	Assignment46()
	{
		System.out.println("child class constructor");
	}

	public static void main(String[] args) {
		// What will happen if we inherit the constructor?
		
		new Assignment46();
		

	}

}
