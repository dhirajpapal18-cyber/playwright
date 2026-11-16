package assignments.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Assignment92 {

	public static void main(String[] args) {
		Map<Integer, String> m1= new HashMap<Integer, String>();
		
		m1.put(111, "Rahul");
		m1.put(222, "Nitin");
		m1.put(333, "Kishor");
		m1.put(777, "Dhiraj");
		m1.put(888, "Pankaj");
		m1.put(999, "Ram");
		m1.put(444, "Sham");
		
		System.out.println(m1.containsKey(111));
		System.out.println(m1.containsValue("my"));
		m1.putIfAbsent(555, "Tushar");
		System.out.println(m1);
		
		System.out.println(m1);
		System.out.println("\n" + "The Keys of given map :");
		for(Integer number : m1.keySet())
		{
			System.out.println(number);
		}
		System.out.println("\n" + "The values of given map :");
		for(String name : m1.values())
		{
			System.out.println(name);
		}
		
		System.out.println("\n" + "The Keys and values of given map :");
		Iterator <Map.Entry<Integer, String>> i1=m1.entrySet().iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}

}
