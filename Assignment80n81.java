package assignments.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Assignment80n81 {

	public static void main(String[] args) {
		ArrayList<Object> a1= new ArrayList<Object>();
		 a1.add('a');
		 a1.add('b');
		 a1.add('c');
		 a1.add('d');
		 a1.add('e');
		 
		
		System.out.println("a1 arrayList : " + a1);
		System.out.println("\n"+"***Used Iterator***"+"\n");
		Iterator<Object> i1= a1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
			
		}
		System.out.println("\n"+"***Used List Iterator with next method***"+"\n");
		ListIterator<Object> i2= a1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("\n"+"***Used List Iterator with previous method***"+"\n");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}

	}

}
