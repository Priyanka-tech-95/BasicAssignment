//3.	Write a Java program to check whether a number is negative, positive or zero.
package myassignment;

import java.util.Scanner;

public class NumIsPosNegZro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number  ");
		int a = sc.nextInt();
		
		if(a>0) {
			System.out.println(+a+" is a positive number");
		}else if(a<0) {
			System.out.println(+a+" is a negative number");
			
		}else if(a==0) {
			System.out.println(+a+" is zero");
		}else {
			System.out.println("Please enter a number");
		
		}System.out.println("I am Wise !!");
	}

}
