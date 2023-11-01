//12.	Write a C program to enter any number and calculate its square root.
package myassignment;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to get it's Square Root");
		int x = sc.nextInt();
		
		System.out.println("Square root of the number "+x +"is " +Math.sqrt(x) );
	}

}
