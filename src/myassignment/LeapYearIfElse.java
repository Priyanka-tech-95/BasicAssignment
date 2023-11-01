//6.	Write a Java program to check whether a year is leap year or not.
package myassignment;

import java.util.Scanner;

public class LeapYearIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year, I will tell you is it a leap year or not ");
		int a = sc.nextInt();
		
		if(a%4 == 0) {
			System.out.println(+a+" is a leap year");
		}else {
			System.out.println(+a+" is not a leap year");
		}System.out.println("I am wise!!!");
	}

}
