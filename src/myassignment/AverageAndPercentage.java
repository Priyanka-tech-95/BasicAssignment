//16.	Write a Java program to enter marks of five subjects and calculate total, average and percentage.
package myassignment;

import java.util.Scanner;

public class AverageAndPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Marks of Subject 1 ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Marks of Subject 2 ");
		int b = sc.nextInt();
		
		System.out.print("Enter the Marks of Subject 3 ");
		int c = sc.nextInt();
		
		System.out.print("Enter the Marks of Subject 4 ");
		int d = sc.nextInt();
		
		System.out.print("Enter the Marks of Subject 5 ");
		int e = sc.nextInt();
		
		System.out.println("The average marks is " +(float)(a+b+c+d+e)/5);
		System.out.println("The percentage marks is " +(float)(a+b+c+d+e)/500*100);
		
	}

}
