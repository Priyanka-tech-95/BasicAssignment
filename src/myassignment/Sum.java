/* 2.	Write a Java program to enter two numbers and find their sum.*/

package myassignment;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a");
		int a = sc.nextInt();
		
		System.out.println("The value of a : " +a);
		
		System.out.print("Enter value of b");
		int b = sc.nextInt();
		
		System.out.println("The value of a : " +b);
		
		System.out.println("The sum of a and b  : " +(a+b));
		

	}

}
