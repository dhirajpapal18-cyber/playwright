/*
 "Write a Java program to take the string ""Java Selenium Testing"" and:
Convert it into a character array using toCharArray().
Split it into words using split("" "").
Print both arrays using Arrays.toString()."
 */
package assignments.java;

import java.util.Arrays;

public class Assignment61 {

	public static void main(String[] args) {
		String a= "Java Selenium Testing";
		char[] c=a.toCharArray();
		
		System.out.println(Arrays.toString(c));
		String[] words=a.split(" ");
		System.out.println(Arrays.toString(words));

	}

}
