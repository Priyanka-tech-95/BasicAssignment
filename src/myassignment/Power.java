//11.	Write a C program to find power of any number x ^ y.
package myassignment;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of X and y, Where x is base value and y is power");
		int x = sc.nextInt();
		int y = sc.nextInt();
		//Math.pow(x, y);
		System.out.println(" x ^ y : " +x +"^"+y +" :"+Math.pow(x, y));
	}

}
