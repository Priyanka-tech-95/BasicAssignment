//18.	Write a Java program to enter P, T, R and calculate Compound Interest.
package myassignment;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Principal Amount  ");
		int p = sc.nextInt();
		
		System.out.print("Enter the Time period in year");
		float t = sc.nextFloat();
		
		System.out.print("Enter the Rate of Interest ");
		float r = sc.nextFloat();
		
		float r1 = 1 + (r/100);
		double pw = Math.pow(r1, t);
		double a = p*pw;
		System.out.println("Amount = "+a +" Compount Interest = " +(a-p));
	}

}
