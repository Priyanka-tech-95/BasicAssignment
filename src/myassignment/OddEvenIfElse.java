//5.	Write a Java program to check whether a number is even or odd.
package myassignment;

import java.util.Scanner;

public class OddEvenIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number, I will tell you is it an odd number or even ");
		int a = sc.nextInt();
		
		if(a%2 == 0) {
			System.out.println(+a+" is a even number");
		}else {
			System.out.println(+a+" is an odd number");
		}System.out.println("I am wise!!!");
	}

}
