/* 1.	Write a Java program to perform input/output of all basic data types into java .*/

package myassignment;

import java.util.Scanner;

public class DataTypeIO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Boolean Value ");
		boolean tf = sc.nextBoolean();
		System.out.println("The Entered Boolean Value is :"+tf);
		
		System.out.print("Enter a Byte Value ");
		byte a = sc.nextByte();
		System.out.println("The Entered Byte Value is :"+a);
		
		System.out.print("Enter a Short Value ");
		short b = sc.nextShort();
		System.out.println("The Entered Short Value is :"+b);
		
		System.out.print("Enter a Integer Value ");
		int c = sc.nextInt();
		System.out.println("The Entered Integer Value is :"+c);
		
		System.out.print("Enter a Float Value ");
		float x = sc.nextFloat();
		System.out.println("The Entered Float Value is :"+x);
		
		System.out.print("Enter a Long Value ");
		long y = sc.nextLong();
		System.out.println("The Entered Long Value is :"+y);
		
		System.out.print("Enter a Double Value ");
		double z = sc.nextDouble();
		System.out.println("The Entered Double Value is :"+z);
		
		System.out.print("Enter a String Value ");
		String st = sc.next();
		System.out.println("The Entered String Value is :"+st);
		
		System.out.print("Enter a StringLine Value ");
		String sl = sc.nextLine();
		System.out.println("The Entered StringLine Value is :"+sl);
		
		System.out.print("Enter a Char Value ");
		char ch = sc.next().charAt(0);
		System.out.println("The Entered Char Value is :"+ch);
	}

}
