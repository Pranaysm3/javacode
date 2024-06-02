package control_Statement;
/*Multiple if-else conditions:You are building a small application 
 * to determine the type of triangle based on the lengths of its sides. 
 * Write a Java program that takes three integers as input representing
 *  the lengths of the sides and prints whether the triangle 
 *  is equilateral, isosceles, or scalene.
 */
import java.util.*;
public class ifelse4triangle {
public static void main(String[]args) {
	int side1,side2,side3;
	@SuppressWarnings("resource")
	Scanner KD=new Scanner(System.in);
	System.out.println("Enter len of first side:");
	side1=KD.nextInt();
	System.out.println("Enter len of Second side:");
	side2=KD.nextInt();
	System.out.println("Enter len of third side:");
	side3=KD.nextInt();
	
	if(side1==side2&& side1==side3 && side2==side3) 
		System.out.println("triangle is equilateral");
	
	else if(side1==side2|| side1==side3 || side2==side3)
		System.out.println("triangle is isosceles");
	else 
		System.out.println("Triangle is an scalene");
	
	
}
}
