package control_Statement;
/*Combining if-else with 
 * logical operators:Suppose you are 
 * developing a simple login system. 
 * Write a Java program that takes a 
 * username and password as input from the user.
 *  If the username is "admin" and the password is "admin123", 
 * print "Login Successful"; 
 * otherwise, print "Login Failed".
 */
import java.util.*;
public class ifelse5idpass {

	public static void main(String[] args) {
		String pass;
		String id;
		String log="admin",pas="admin123";
		@SuppressWarnings("resource")
		Scanner RD=new Scanner(System.in);
		System.out.println("Enter your username:");
		id=RD.nextLine();
		System.out.println("Enter your password:");
		pass=RD.nextLine();
		if(id.equals(log)&& pass.equals(pas))
			System.out.println("Login Succcessful");
		else
			System.out.println("Login fail try again");
		
	}

}
