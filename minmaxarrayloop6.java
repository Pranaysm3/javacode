package control_Statement;
/*Using if-else with arrays or collections: 
 * You are tasked with finding the
 *  maximum and minimum numbers in an array.
 *   Write a Java program that takes an array of 
 *   integers as input and prints 
 *   the maximum and minimum numbers in the array.
 */
import java.util.*;
public class minmaxarrayloop6 {
public static void main(String[]args) {
	int i;
	float greater=0,less=0;
float[]arr =new float[10];
Scanner RD=new Scanner(System.in);
System.out.println("Enter no 1");
arr[0]=RD.nextFloat();
for(i=1;i<10;i++) {
	System.out.println("Enter no "+(i+1));
	arr[i]=RD.nextFloat();
	if(arr[i]>greater) {
		greater=arr[i];
	}
}
	less=arr[0];
	for(int j=0;j<10;j++) {
	
		if(arr[j]<less) {
			less=arr[j];
		}
	
	
}


for(float a:arr) {
	System.out.println("="+a);
}


System.out.println("greater num is:"+greater);
System.out.println("smaller num is:"+less);
System.out.println(arr[0]);

}
}  
