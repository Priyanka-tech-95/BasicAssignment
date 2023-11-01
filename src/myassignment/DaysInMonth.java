// 2.	Write a Java program print total number of days in a month using switch case.
package myassignment;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Month (1-12)");
		int m = sc.nextInt();
		
		switch(m) {
		case 1:
			System.out.println("First month of a year is January and having 31 days");
			break;
		
		case 2:
			System.out.println("Second month of year is February and having 28 or 29 days");
			break;
			
		case 3:
			System.out.println("Third month of year is March and having 31 days");
			break;
			
		case 4:
			System.out.println("Fourth month of year is April and having 30 days");
			break;
			
		case 5:
			System.out.println("Fifth month of year is May and having 31 days");
			break;
			
		case 6:
			System.out.println("Sixth month of year is June and having 30 days");
			break;
			
		case 7:
			System.out.println("Seventh month of year is July and having 31 days");
			break;
		case 8:
			System.out.println("Eigth month of year is August and having 31 days");
			break;
		case 9:
			System.out.println("Ninth month of year is September and having 30 days");
			break;	
		case 10:
			System.out.println("Tenth month of year is October and having 31 days");
			break;	
		case 11:
			System.out.println("Eleventh month of year is November and having 30 days");
			break;
		case 12:
			System.out.println("Twelfth month of year is December and having 31 days");
			break;
		default :
			System.out.println("Number is out of Scope");
		}System.out.println("I am wise !!!");
	}

}
