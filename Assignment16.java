package assignments.java;

public class Assignment16 {

	public static void main(String[] args) {
		// Write a Program on nested if Else Block_Case
		
		int age = 19;
		char gender = 'M';
		int weight = 40;
		
		if(age >18)
		{
			if(gender == 'M' && weight >=50)
			{    
				System.out.println("You are eligible to attend the miltery training");
			}
			
			else if(gender != 'M' && weight !=50 && weight<50)
			{
				System.out.println("gender and weight are not matching");
			}
			else if(gender == 'F')
			{
				System.out.println("gender is not matching");
			}
			
			else
			{
				System.out.println("You are not elegible as we need weight above 50KGs");
			}
		}
		else
		{
			System.out.println("You are not elgible as you are not 18+");
		}

	}

}
