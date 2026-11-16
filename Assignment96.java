package assignments.java;

import java.util.Enumeration;
import java.util.Vector;

public class Assignment96 {

	public static void main(String[] args) {
		Vector<String> v1=new Vector<String>();
		v1.add("One");
		v1.add("Two");
		v1.add("Three");
		v1.add("Four");
		
		System.out.println(v1);
		
		Enumeration<String> e1= v1.elements();
		while(e1.hasMoreElements())
		{
			System.out.println(e1.nextElement());
		}
	}

}
