package assignments.java;

import java.util.HashMap;
import java.util.Map;

public class Assignment93 {

	public static void main(String[] args) {
		Map<Integer, String> m1= new HashMap<Integer, String>();
		m1.put(111, "Rahul");
		m1.put(222, "Nitin");
	
		
		Map<Integer, String> m2= new HashMap<Integer, String>();	
		m2.put(77, "Dhiraj Papal");
		m2.put(99, "Ram Yadav");
		m2.put(44, "Sham Yadav");
		
		System.out.println(m1);
		m1.putAll(m2);
		System.out.println(m1);
		m1.replace(44, "Vaibhav");
		System.out.println(m1);
		m1.putIfAbsent(000, "Krishna");
		System.out.println(m1);
		System.out.println(m1.size());
		System.out.println(m1.isEmpty());
		m2.clear();
		System.out.println(m2);
		m1.remove(222, "Nitin");
		System.out.println(m1);
		
	}

}
