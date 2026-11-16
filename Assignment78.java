package assignments.java;
import java.util.ArrayList;
import java.util.Collections;

public class Assignment78 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(7);
		a1.add(4);
		a1.add(9);
		a1.add(3);
		a1.add(6);
		a1.add(1);
		a1.add(8);
		a1.add(5);
		a1.add(2);
		System.out.println("Here is my ArrayList : ");
		System.out.println(a1);
		System.out.println("***Sort***");
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println("***Reverse***");
		Collections.reverse(a1);
		System.out.println(a1);
		System.out.println("***Shuffle***");
		Collections.shuffle(a1);
		System.out.println(a1);
		System.out.println("***Max***");
		int max = Collections.max(a1);
		System.out.println(max);
		System.out.println("***Min***");
		int min=Collections.min(a1);
		System.out.println(min);
		System.out.println("***swap***");
		Collections.swap(a1, 0, 2);
		System.out.println(a1);
		System.out.println("***count***");
		int count = Collections.frequency(a1, 5);
        System.out.println("Frequency of 10 in the list: " + count);
	}
}
