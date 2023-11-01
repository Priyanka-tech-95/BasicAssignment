//6.	Write a Java program to create Simple Calculator using switch case.
package myassignment;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second number ");
		int b = sc.nextInt();
		
		System.out.print("Which operation you want to preform , Please enter sign (+,-, *,/,%)");
		char ch =sc.next().charAt(0);
		
		switch(ch) {
		case '+':
			System.out.println("A + B = "+(a+b));
			break;
		
		case '-':
			System.out.println("A - B = "+(a-b));
			break;
			
		case '*':
			System.out.println("A * B = "+(a*b));
			break;
			
		case '/':
			System.out.println("A / B = "+(float)a/b);
			break;
			
		case '%':
			System.out.println("A % B = "+(a%b));
			break;
		default:
			System.out.println("You enter out of scope symbol");
		}System.out.println("I am wise !!!");
	}

}
