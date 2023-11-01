/*5.	Write a java program to enter length and breadth of a rectangle and find its area.*/
 package myassignment;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Length of Rectangle in cm");
		int a = sc.nextInt();
		
		System.out.println("Length of Rectangle : " +a +"cm");
		
		System.out.print("Enter Breadth of Rectangle in cm");
		int b = sc.nextInt();
		
		System.out.println("Breadth of Rectangle : " +b +"cm");
		
		System.out.println("Perimeter of Rectangle  : " +(a*b)+"Sq_cm");

	}

}
