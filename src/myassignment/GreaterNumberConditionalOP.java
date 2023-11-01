//1.	Write a Java program to find maximum between two numbers using conditional operator.
package myassignment;

import java.util.Scanner;

public class GreaterNumberConditionalOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second number ");
		int b = sc.nextInt();
		
		int rs = (a > b)? a : b;
		System.out.println("The Greater number is "+rs);
		
	}

}
