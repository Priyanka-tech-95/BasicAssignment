//3.	Write a Java program to check whether a number is even or odd using conditional operator.
package myassignment;

import java.util.Scanner;

public class OddEvenConOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number ");
		int a = sc.nextInt();
		boolean tf = a%2 == 0 ? true : false;
		if(tf == true) {
			System.out.println("Number "+a+" is a even number");
		}else {
			System.out.println("Number "+a+" is a odd number");
		}
		//System.out.println("Number "+a+"is" +(a%2 == 0 ? Even : Odd));
	}

}
// Check stmt from sir.