package assignments.java;
public class Assignment82to85 {

	public static void main(String[] args) {
		//WAP for Primitive type casting from int to long
		int intNum= 10;		
		long longNum=intNum;
		System.out.println("int Number : " + intNum);
		System.out.println("int covert in long Number : " + longNum + "\n");
		
		//WAP for Primitive type casting from long into int	
		long longNum2= 2345;
		int intNum2=(int) longNum2;
		System.out.println("long Number2 : " + longNum2);
		System.out.println("long convert into int Number2 : " + intNum2+ "\n");
		
		//WAP for Primitive type casting from int into double
		int intNum3=30;
		double intdouble=intNum;
		System.out.println("int Number3 : " + intNum3);
		System.out.println("int convert into double : " + intdouble+ "\n");
		
		//WAP for Primitive type casting from double into int
		double doubleNum2= 789.54;
		int intNum4=(int) doubleNum2;
		System.out.println("double Number : " + doubleNum2);
		System.out.println("double convert into int : " + intNum4+ "\n");
	}
}
