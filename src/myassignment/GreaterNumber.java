//4.	Write a Java program to find maximum between two numbers using switch case.
package myassignment;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second number ");
		int b = sc.nextInt();
		int c = 0;
		if(a>b) {
			 c = 1;
		}
		 switch(c) {
		 case 1:
			 System.out.println(+a+" is greater number");
			 break;
		 case 0:
			 System.out.println(+b+" is greater number");
		 }
	
		
			
		
	}

}
