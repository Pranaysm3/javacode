package control_Statement;
// program to find number is prime or not
import java.util.*;
public class ifcode2 {
	public static void main(String[]args) {
		int n,y=0;
		Scanner TK=new Scanner(System.in);
		System.out.println("ENter num to check PRIME or NOT PRIME:");
		n=TK.nextInt();
		for(int i=2;i<=n/2;i++) {
			System.out.println(+n+"%"+i+"="+n%i);
			if(n%i==0) {
				y=1;
				break;
				
			}
			if(n%i!=0) {
				y=0;
				
			}
		}
		if(y==1) {
			System.out.println("Num is not prime those divisible by upper num");
		}
		else {
			System.out.println("num is  prime");
		}
		
		TK.close();
	}

}
