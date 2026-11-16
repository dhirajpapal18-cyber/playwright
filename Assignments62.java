/*
"Write a Java program to create three arrays:
An integer array for roll numbers
A String array for student names
A double array for marks"
 */
package assignments.java;
public class Assignments62 {

	public static void main(String[] args) {
		int[] rollNumber= {101, 102, 103, 104};
		String[] studentsName= {"Ram", "Sham", "Rahul", "Rekha"};
		double[] marks= {78.23, 79.56, 72.78, 80.56};
		
		for(int i=0; i<rollNumber.length; i++)
		{
			System.out.println(rollNumber[i] + " - " + studentsName[i] + " - " + marks[i]);
		}

	}

}
