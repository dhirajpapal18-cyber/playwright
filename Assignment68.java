package assignments.java;
import java.util.Arrays;

public class Assignment68 {
	static int countAlphabets=0;
	static int countDigits=0;
	static int countSpecialChar=0;
	static int countWhiteSpace=0;

	public static void main(String[] args) {
		String input="##dhirajpapal149@gmail.com##";
		char[] ch=input.toCharArray();
		
		System.out.println("Here is the array of given string : ");
		System.out.println(Arrays.toString(ch));
		System.out.println("***************************");
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isAlphabetic(ch[i]))
			{
				countAlphabets++;
			}
			else if(Character.isDigit(ch[i]))
			{
				countDigits++;
			}
			else if(Character.isWhitespace(ch[i]))
			{
				countWhiteSpace++;
			}
			else
			{
				countSpecialChar++;
			}
		}	
		System.out.println("The number of alphabets in string is : " +countAlphabets);
		System.out.println("The number of digits in string is : " + countDigits);
		System.out.println("The number of white space in string is : "+countWhiteSpace);
		System.out.println("The number of special character is : " +countSpecialChar);
	}
}
