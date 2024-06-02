package control_Statement;
import java.util.*;
//Compare numbers is and show which is greater using scanner
public class ifcode1 {

	public static void main(String[] args) {
		int a,b,c;
		Scanner TK=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=TK.nextInt();
		System.out.println("Enter value of b:");
		b=TK.nextInt();
		System.out.println("Enter value of c");
		c=TK.nextInt();
		
		if(a>b && a>c ) {
			System.out.println("A is greater..");
			
			
		}
		else if(b>a && b>c) {
			System.out.println("B is greater...");
			
		}
		else if(c>a && c>b) {
			System.out.println("C is greater...");
			
		}
		else {
			System.out.println("use proper num.....");
		}
		TK.close();
		}

}
