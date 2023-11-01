/* 6.	Write a java program to enter radius of a circle and find its diameter, circumference and area.*/
package myassignment;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Radius of a circle cm");
		int a = sc.nextInt();
		System.out.println("The Radius of circle :" +a +"cm");
		System.out.println("The Diameter of circle is "+ (2*a) +"cm");
		System.out.println("The Circumference of circle is "+ ((float)2*22/7*a)+"cm");
		System.out.println("The Area of circle is "+ ((float)22/7*a*a)+"sq_cm");
		
		

	}

}
