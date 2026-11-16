/*
Write a Java program to create Strings using String literals and the new keyword, 
and compare them using == and equals().
*/
package assignments.java;

public class Assignment74 {

	public static void main(String[] args) {
		String str= "Java";
		String str2= "Java";
		
		StringBuffer strBuff= new StringBuffer("Java");
		StringBuffer strBuff2= new StringBuffer("Java");
		
		System.out.println("Is str and str2 having same address : " + (str==str2));
		System.out.println("Is str and str2 having same value : " + str.equals(str2));
		System.out.println("Is strBuff and strBuff having same address : " + (strBuff==strBuff2));
		System.out.println("Is strBuff and strBuff having same value : " + strBuff.equals(strBuff2));
		

	}

}
