//15.	Write a Java program to calculate area of an equilateral triangle.
package myassignment;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the  side of Equilateral Triangle");
		int a = sc.nextInt();
		
		System.out.println("Area of equilateral Triangle is : " +(Math.sqrt(3)/4)*a*a);
	}

}
