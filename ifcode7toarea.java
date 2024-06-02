package control_Statement;
/*Error handling with if statements:You are building a

 *  program to calculate the area of geometric shapes. 
 *  Write a Java program that takes the type 
 *  of shape (circle or rectangle) and relevant
 *   parameters (radius for circle, length and width for rectangle) 
 *   as input and prints the area. Ensure to handle invalid inputs
 *    gracefully.These questions provide practical scenarios where 
 *    understanding and applying if statements in Java are essential.
 *     They cover a range of situations to test comprehension and 
 *    problem-solving skills.
 */

import java.util.*;

public class ifcode7toarea {
	
public static void main(String[]args) {
	float tri,rec,len=0,bre=0,radi;
	double Area=0;
	final double PI=3.14;
	char choice;
Scanner RD=new Scanner(System.in);
	System.out.println("Enter T for Triangle and R for rectangle:");
	choice=RD.next().charAt(0);
	if(choice=='T'||choice=='t') {
		try {
		System.out.println("Enter base of Triangle:");
		len=RD.nextFloat();
		System.out.println("Enter Height of Triangle:");
		bre=RD.nextFloat();
		}catch(InputMismatchException e) {
			System.out.println("enter valid number..");
		}
		try {
			Area=0.5*len*bre;
			
		}catch(ArithmeticException e) {
			System.out.println("use proper value....");
		}
		System.out.println("Area of triangle is:"+Area+"sqcm");
	}
		else if(choice=='C'||choice=='c') {
		System.out.println("Enter radius of circle");
		radi=RD.nextFloat();
		try {
			Area=PI*radi*radi;
		}catch(ArithmeticException e) {
			System.out.println("use proper value...");
		}
		System.out.println("Area of circle:"+Area);
	}
		else {
			System.out.println("something else:...");
		}
}
}
