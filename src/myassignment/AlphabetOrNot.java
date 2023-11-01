//7.	Write a Java program to check whether a character is alphabet or not.
package myassignment;

import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character, I will tell you it is alphabet or not ");
		char ch = sc.next().charAt(0);
		
		if((ch>='a' && ch <='z')||(ch>='A'&& ch<='Z')){
		System.out.println("You have enter an alphabet");
		}else {
			System.out.println("You have not enter an alphabet");
		}System.out.println("I am wise!!!");
	}

}
