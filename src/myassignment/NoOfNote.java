//13.	Write a Java program to count total number of notes in given amount.
package myassignment;

import java.util.Scanner;

public class NoOfNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total amount");
		int a = sc.nextInt();
		System.out.print("Enter the currency note Denomination");
		int b = sc.nextInt();
		int c = a/b;
		int re = a%b;
		if(c>0 && re>0) {
			System.out.println("Total number of note with Denomination "+b+"for amount "+a+" is "+c+"note and " +re+" Coins of 1 rupee");
		}else if(c>0){
			
			System.out.println("Total number of note with Denomination "+b+"for amount "+a+" is "+c);
		}else {
			System.out.println("Please enter a valid amount");
		}System.out.println("I am wise !!!!");
	}

}
