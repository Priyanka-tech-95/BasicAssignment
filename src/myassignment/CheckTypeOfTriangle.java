//16.	Write a Java program to check whether the triangle is equilateral, isosceles or scalene triangle.
package myassignment;

import java.util.Scanner;

public class CheckTypeOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of first Side of Triangle (Side must be greater than 0)");
		int a = sc.nextInt();
		System.out.print("Enter the length of Second side of Triangle (Side must be greater than 0)");
		int b = sc.nextInt();
		System.out.print("Enter the length of third side of Triangle (Side must be greater than 0)");
		int c = sc.nextInt();
		if((a==b)&&(a==c)) {
			System.out.println("This is an Equilateral Triangle");
		}else if((a==b)||(a==c)) {
			System.out.println("This is an Isosceles Triangle");
		}else {
			System.out.println("This is a Scalene");
		}
		
	}

}
