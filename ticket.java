
/*Chaining if-else statements:Imagine you are designing a ticket booking system for a cinema. 
Write a Java program that takes the age of the customer 
as input and prints the ticket price based on the following criteria:
Age < 5: Free ticket
Age >= 5 and < 18: Child ticket (price $8)
Age >= 18 and < 60: Adult ticket (price $12)
Age >= 60: Senior citizen ticket (price $6)
*/
import java.lang.*;
import java.util.*;
class Ticket{
public static void main(String[]args){
int age;
Scanner RD=new Scanner(System.in);
System.out.println("Enter age of candidate:");
age=RD.nextInt();

if(age<5)
System.out.println("Congratuation!! candidate able for free ticket");
else if(age>=5 && age<18)
System.out.println("Congratuation!! candidate able for off ticket pay only $8");
else if(age>=18 && age<60)
System.out.println("Congratuation!! candidate can watch your cinema in this busy scedule with only $12");
else if(age>60)
System.out.println("Congratuation!! candidate able for off ticket as senior citizen pay only $6.TAKE CARE");
else
System.out.println("Enter proper age");

}
}





