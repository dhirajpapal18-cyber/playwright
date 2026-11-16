/*Write a Java program to use split(), replace(), and replaceAll()
  methods on given strings and print the results. + contains + equal + matches*/
package assignments.java;
import java.util.Arrays;

public class Assignment72 {

	public static void main(String[] args) {
		String str = "My Name Is Vishnu @123#456$";
		String str2="Auto";
		System.out.println("Split the string 5 times at white space : ");
		System.out.println(Arrays.toString(str.split(" ", 5))+"\n");
		
		System.out.println("replace the string word Vishnu to Ram : ");
		System.out.println(str.replace("Vishnu", "Ram")+"\n");
		
		System.out.println("replace all small letters from the string to * : ");
		System.out.println(str.replaceAll("[a-z]", "*")+"\n");
		
		System.out.println("Is Vishnu name is there in the given string search by using contains():");
		System.out.println("Vishnu name is in string : " +str.contains("Vishnu")+"\n");
		
		System.out.println("Is Str equals to str2 finds by equals(): ");
		System.out.println("str and str2 strings are diff : "+ str.equals(str2)+"\n");
		
		System.out.println("finds the word Name is present in between the string : ");
		System.out.println("is Name word is there in between the str : "+str.matches(".*Name.*"));
	}

}
