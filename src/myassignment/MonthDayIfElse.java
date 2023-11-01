//12.	Write a C program to input month number and print number of days in that month.
package myassignment;

import java.util.Scanner;

public class MonthDayIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month  number (1-12), I will tell you Month Name and number of day");
		int ch = sc.nextInt();
		if(ch == 1 ){
			System.out.println("It is January and having 31 days");
			
		}else if(ch == 2) {
			System.out.println("It is February and having 28 or 29 days");
		}else if(ch == 3) {
			System.out.println("It is March and having 31 days");
		}else if(ch == 4) {
			System.out.println("It is April and having 30 days");
		}else if(ch == 5) {
			System.out.println("It is May and having 31 days");
		}else if(ch == 6) {
			System.out.println("It is June and having 30 days");
		}else if(ch == 7) {
			System.out.println("It is July and having 31 days");
		}else if(ch == 8) {
			System.out.println("It is August and having 31 days");
		}else if(ch == 9) {
			System.out.println("It is September and having 30 days");
		}else if(ch == 10) {
			System.out.println("It is October and having 31 days");
		}else if(ch == 11) {
			System.out.println("It is November and having 30 days");
		}else if(ch == 12) {
			System.out.println("It is December and having 31 days");
		}else {
			System.out.println("Please enter number From 1 to 12");
		}
			
		System.out.println("I am Wise !!!!");
		
	}

}
