//3.	Write a Java program to check whether an alphabet is vowel or consonant using switch case.
package myassignment;

import java.util.Scanner;

public class CaseCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a alphabet ,then I will tell you it is vowel or consonant");
		char ch = sc.next().charAt(0);
		
		switch(ch) {
		case 'a','A':
			System.out.println("You have enter a vowel");
			break;
		
		case 'e','E':
			System.out.println("You have enter a vowel");
			break;
			
		case 'i','I':
			System.out.println("You have enter a vowel");
			break;
			
		case 'o','O':
			System.out.println("You have enter a vowel");
			break;
			
		case 'u','U':
			System.out.println("You have enter a vowel");
			break;
		default :
			System.out.println("You have enter a consonant");
	}System.out.println("I am wise !!!");
	}
}
