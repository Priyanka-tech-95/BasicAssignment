//10.	Write a Java program to check whether a character is uppercase or lowercase alphabet.
package myassignment;

import java.util.Scanner;

public class CheckUpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any alphabet, I will tell you it is in Upper case or Lower case ");
		char ch = sc.next().charAt(0);
		if(ch>='a'&&ch<='z') {
			System.out.println("You have enter a lower case alphabet");
		}else if(ch>='A'&&ch<='Z') {
			System.out.println("You have enter a Upper Case alphabet");
		}else {
			System.out.println("Please enter an alphabet");
		}System.out.println("I am Wise!!!");
	}

}
