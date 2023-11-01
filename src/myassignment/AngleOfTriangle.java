//13.	Write a C program to enter two angles of a triangle and find the third angle.
package myassignment;

import java.util.Scanner;

public class AngleOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  First angle of Triangle");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second angle of Triangle");
		int b = sc.nextInt();
		
		System.out.println("The third angle of triangle : " +(180 -(a+b)));
	}

}
