//8.	Write a Java program to input any alphabet and check whether it is vowel or consonant.
package myassignment;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any alphabet, I will tell you it is vowel or consonant ");
		char ch = sc.next().charAt(0);
		if((ch>='a')&&(ch<='z')||(ch>='A')&&(ch<='Z')) {
		if(ch == 'a' ){
			System.out.println("You have enter Vowel");
			
		}else if(ch == 'A') {
			System.out.println("You have enter Vowel");
		}else if(ch == 'e') {
			System.out.println("You have enter Vowel");
		}else if(ch == 'E') {
			System.out.println("You have enter Vowel");
		}else if(ch == 'i') {
			System.out.println("You have enter Vowel");
		}else if(ch == 'I') {
			System.out.println("You have enter Vowel");
		}else if(ch == 'o') {
			System.out.println("You have enter Vowel");
		}else if(ch == 'O') {
			System.out.println("You have enter Vowel");
		}else if(ch == 'u') {
			System.out.println("You have enter Vowel");
		}else if(ch == 'U') {
			System.out.println("You have enter Vowel");
		}else {
			System.out.println("You have enter consonant");
		}
		}else {
			System.out.println("Please enter an alphabet");
		}
		System.out.println("I am Wise !!!");
	}

}
