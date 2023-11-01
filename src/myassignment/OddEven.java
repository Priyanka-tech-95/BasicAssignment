//5.	Write a Java program to check whether a number is even or odd using switch case.
package myassignment;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number, I will tell you it is odd number or even number ");
		int a = sc.nextInt();
		int ch = a%2;
		switch(ch) {
		case 0:
			System.out.println("Number "+a+" is Even number");
			break;
		case 1:
			System.out.println("Number "+a+" is odd number");
			break;
			default:
				System.out.println("Please enter a number");
			
		}System.out.println("I am wise !!");
	}

}
//Check why it is not going in default and x stmt.