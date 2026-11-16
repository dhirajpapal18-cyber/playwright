package assignments.java;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Assignment90 {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>(Set.of(10,20,30,40,50));
		System.out.println("Original 1st Set : " +s1);
		s1.add(60);
		System.out.println("Used add() : " +s1);
		Set<Integer> s2=new HashSet<Integer>();
		s2.add(100);
		s2.add(200);
		s2.add(300);
		s2.add(400);
		System.out.println("Original 2nd Set : " +s2);
		s1.addAll(s2);
		System.out.println("Used addAll() : " + s1);
		System.out.println("Used containdAll() : " + s1.containsAll(s1));
		s1.removeAll(s2);
		System.out.println("Used removeAll() : "+s1);
		s2.clear();
		System.out.println("Used clear() for s2: " +s2);
		s1.remove(50);
		System.out.println("Used remove() : " +s1);
		System.out.println("size of 1st Set : "+ s1.size());
		System.out.println("Used isEmpty() : "+ s2.isEmpty());
		System.out.println("Used contains() : " + s1.contains(10) + "\n");
		System.out.println("Used Iterator : ");
		Iterator<Integer> i1= s1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
	}
	
	
}
