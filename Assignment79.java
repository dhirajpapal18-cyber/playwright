package assignments.java;

import java.util.ArrayList;

public class Assignment79 {

	public static void main(String[] args) {
		ArrayList<Object> a1= new ArrayList<Object>();
		a1.add("c");
		a1.add(21);
		a1.add("Study");
		a1.add(23.5f);
		System.out.println("ArrayList a1 > " +a1);
		
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.add(11);
		a2.add(22);
		a2.add(33);
		a2.add(44);
		a2.add(55);
		System.out.println("ArrayList a2 > " +a2);
		
		System.out.println("*****************");
		
		a1.add(45);
		System.out.println("***add***");
		System.out.println(a1);
		
		a1.add(0, 99);
		System.out.println("\n"+"***add at index***");
		System.out.println(a1);
		
		a1.addAll(a2);
		System.out.println("\n"+"***add collection***");
		System.out.println(a1);
		
		boolean b=a1.contains("yes");
		System.out.println("\n"+"***is a1 contains object 'yes' : ***");
		System.out.println(b);
		
		boolean b2=a1.containsAll(a2);
		System.out.println("\n"+"***is a1 contains a2 collection : ***");
		System.out.println(b2);
		
		a1.remove("Study");
		System.out.println("\n"+"***remove object***");
		System.out.println(a1);
		
		a1.remove(1);
		System.out.println("\n"+"***remove object at index***");
		System.out.println(a1);
		
		a1.removeAll(a2);
		System.out.println("\n"+"***remove collection***");
		System.out.println(a1);
		
		a1.clear();
		System.out.println("\n"+"***Clear the ArrayList***");
		System.out.println(a1);
		
		boolean b3=a1.isEmpty();
		System.out.println("\n"+"***is ArrayList is empty***");
		System.out.println(b3);
		
		System.out.println("\n"+"***get the value at index 0 of a2***");
		System.out.println(a2.get(0));
		
		System.out.println("\n"+"***a1 equals to a2***");
		System.out.println(a1.equals(a2));
	}

}
