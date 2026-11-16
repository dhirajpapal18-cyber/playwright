package assignments.java;

public class Assignment76 {

	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("Java");
		System.out.println("****String Buffer****");
		System.out.println(a);
		a.append(" is programming language");
		System.out.println("append : " + a);
		a.insert(7, " robust");
		System.out.println("insert : " +a);
		a.delete(8, 15);
		System.out.println("delete : " + a);
		a.replace(0, 4, "Python");
		System.out.println("replace : " + a);
		
		StringBuilder a1=new StringBuilder("Java");
		System.out.println("\n" + "****String Builder****");
		System.out.println(a1);
		a1.append(" is programming language");
		System.out.println("append : " + a1);
		a1.insert(7, " robust");
		System.out.println("insert : " +a1);
		a1.delete(8, 15);
		System.out.println("delete : " + a1);
		a1.replace(0, 4, "Python");
		System.out.println("replace : " + a1);
	}

}
