//15.	Write a Java program to input all sides of a triangle and check whether triangle is valid or not.
package myassignment;

import java.util.Scanner;

public class CheckSideValTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Side of Triangle (Side must be greater than 0)");
		int a = sc.nextInt();
		System.out.print("Enter the Second side of Triangle (Side must be greater than 0)");
		int b = sc.nextInt();
		System.out.print("Enter the third side of Triangle (Side must be greater than 0)");
		int c = sc.nextInt();
		if((a+b>c)&&(b+c>a)&&(c+a>b) ) {
			System.out.println("Triangle is possible");
		}else {
			System.out.println("Triangle is not Possible");
		}System.out.println("I am wise !!!");
	}

}
