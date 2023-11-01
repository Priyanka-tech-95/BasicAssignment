//14.	Write a Java program to input angles of a triangle and check whether triangle is valid or not.
package myassignment;

import java.util.Scanner;

public class CheckAngleValTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first angle of Triangle (Angle must be greater than 0)");
		int a = sc.nextInt();
		System.out.print("Enter the Second angle of Triangle (Angle must be greater than 0)");
		int b = sc.nextInt();
		System.out.print("Enter the third angle of Triangle (Angle must be greater than 0)");
		int c = sc.nextInt();
		
		if(a+b+c == 180) {
			System.out.println("With Angle a "+a+ " Angle b "+b+" Angle c "+c+" Triangle is possible");
		}else {
			System.out.println("Triangle is not possible");
		}System.out.println("I am Wise !!!");
	}

}
