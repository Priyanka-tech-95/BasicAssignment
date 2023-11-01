//17.	Write a Java program to enter P, T, R and calculate Simple Interest.
package myassignment;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal Amount  ");
		int p = sc.nextInt();
		
		System.out.print("Enter the Time period in year");
		float t = sc.nextFloat();
		
		System.out.print("Enter the Rate of Interest ");
		float r = sc.nextFloat();
		
		System.out.println("Simple interest is : "+(float)(p*r*t)/100);
	}

}
