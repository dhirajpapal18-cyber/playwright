package assignments.java;

public class Assignment58 {

	public static void main(String[] args) {
		//WAP to iterate each character in the given String
		String a= "My name is Dhiraj";
		for(int i=0; i<a.length();i++)
		{
			char c= a.charAt(i);
			if(c!=' ')
			{
				System.out.println(c);
			}
			
		}

	}

}
