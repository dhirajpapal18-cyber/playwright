//WAP for Class type casting using Upcasting - implicitly (Child class to Parent class object)
package assignments.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment86 {

	public static void main(String[] args) {
	List<Object> a1=new ArrayList<Object>(Arrays.asList(10,20,30,40,50));
	System.out.println(a1);
	
	a1.add(60);
	System.out.println("Used add() : " +a1);
	
	a1.add(0, 5);
	System.out.println("Used add at index : " +a1);
	
	boolean b= a1.contains(50);
	System.out.println("Used contains() : " +b);
	
	List<Object> a2=a1;
	boolean b2= a1.equals(a2);
	System.out.println("Used equals() : " +b2);
	
	a2.clear();
	System.out.println("Used clear() : " +a2);

	}

}
