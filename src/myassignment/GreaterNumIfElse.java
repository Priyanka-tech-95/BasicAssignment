//1.	Write a Java program to find maximum between two numbers.
package myassignment;

import java.util.Scanner;

public class GreaterNumIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second number ");
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(+a+" is greater number");
		}else {
			System.out.println(+b+" is greater number");
		}
	}

}
