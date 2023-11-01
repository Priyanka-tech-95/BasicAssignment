//14.	Write a C program to enter base and height of a triangle and find its area.
package myassignment;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  Base of Triangle");
		int a = sc.nextInt();
		
		System.out.print("Enter the Height of Triangle");
		int b = sc.nextInt();
		
		System.out.println("The third angle of triangle : " +(float)(0.5*a*b));
	}

}
