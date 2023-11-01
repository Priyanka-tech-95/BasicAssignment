//11.	Write a Java program to input week number and print week day.
package myassignment;

import java.util.Scanner;

public class WeekDayIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Week day number (1-7), I will tell you day");
		int ch = sc.nextInt();
		if(ch == 1 ){
			System.out.println("It is Sunday");
			
		}else if(ch == 2) {
			System.out.println("It is Monday");
		}else if(ch == 3) {
			System.out.println("It is Tuesday");
		}else if(ch == 4) {
			System.out.println("It is Wednesday");
		}else if(ch == 5) {
			System.out.println("It is Thursday");
		}else if(ch == 6) {
			System.out.println("It is Friday");
		}else if(ch == 7) {
			System.out.println("It is Saturday");
		}else {
			System.out.println("Please enter number From 1 to 7");
		}
			
		System.out.println("I am Wise !!!!");
		
	}


}