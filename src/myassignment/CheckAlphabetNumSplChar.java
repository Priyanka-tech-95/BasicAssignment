//9.	Write a Java program to input any character and check whether it is alphabet, digit or special character.
package myassignment;

import java.util.Scanner;

public class CheckAlphabetNumSplChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a character, I will tell you it is alphabet or Number or Special Character ");
		char ch = sc.next().charAt(0);
		if((ch>='a' && ch <='z')||(ch>='A'&& ch<='Z')){
			System.out.println("You have enter an alphabet");
			}else if(ch>=0 && ch<=9) {
				System.out.println("You have enter a number");
			}else{
				System.out.println("You have enter a special Character");
			}System.out.println("I am wise!!!");
	}

}
