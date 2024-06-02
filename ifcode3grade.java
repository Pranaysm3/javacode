package control_Statement;
/*  1Nested if statements:Imagine you are developing a grading system for a school. Write a Java program that takes a student's score as input and prints their grade based on the following criteria:
A score >= 90: Grade A
A score >= 80 and < 90: Grade B
A score >= 70 and < 80: Grade C
A score >= 60 and < 70: Grade D
A score < 60: Grade F

*/
import java.util.*;

public class ifcode3grade {
	public static void main(String[] args) {
		int x;
	
		Scanner TK=new Scanner(System.in);
		System.out.println("Enter your score:");
		x=TK.nextInt();
		if(x>=90)
			System.out.println("Grade A");
		else if(x>=80)
			System.out.println("Grade B");
		else if(x>=70)
			System.out.println("Grade c");
		else if(x>=60)
			System.out.println("Grade D");
		else {
			System.out.println("FAIL");
		}
		TK.close();
	}

}
