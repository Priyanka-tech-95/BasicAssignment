//4.	Write a C program to check whether year is leap year or not using conditional operator.
package myassignment;

import java.util.Scanner;

public class LeapYearConOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year ");
		int a = sc.nextInt();
		boolean tf = a%4 == 0 ? true : false;
		if(tf == true) {
			System.out.println("Year "+a+" is a Leap year");
		}else {
			System.out.println("Year "+a+" is not a Leap year");
		}
	}

}
