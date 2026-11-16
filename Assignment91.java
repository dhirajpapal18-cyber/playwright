package assignments.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Assignment91 {

	public static void main(String[] args) {
		Collection<Integer> numbers= new ArrayList<Integer>();
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
		
		System.out.println(numbers);
		Collection<Integer> numbers2= new ArrayList<Integer>(Arrays.asList(55,66,77,88));
		System.out.println(numbers2);
		
		System.out.println("\n" + "addAll() : ");
		numbers.addAll(numbers2);
		System.out.println(numbers);
		
		System.out.println("\n" + "removeAll() : ");
		numbers.removeAll(numbers2);
		System.out.println(numbers);
		
		numbers2.clear();
		System.out.println("\n"+"clear() numbers2 arraylist: ");
		System.out.println(numbers2);
		
		System.out.println("\n"+"remove() : ");
		numbers.remove(11);
		System.out.println(numbers);
		
		System.out.println("\n" + "size of arraylist : " + numbers.size());
		System.out.println("\n"+ "is numbers2 arraylist is empty : "+ numbers2.isEmpty());
		System.out.println("\n" + "numbers arraylist contains value 11 : " + numbers.contains(11));
		System.out.println("\n" + "numbers arraylist contains numbers2: " + numbers.containsAll(numbers2));
		Iterator<Integer> i1= numbers.iterator();
		System.out.println("\n" + "Iterator arraylisr numbers : ");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
	}

}
