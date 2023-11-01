/*7.	Write a Java program to enter length in centimeter and convert it into meter and kilometer.*/
package myassignment;

import java.util.Scanner;

public class CmToKm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length in cm");
		int a = sc.nextInt();
		
		System.out.println("The Length is :" +a +"cm");
		
		System.out.println("The length in meter is " +((float)a/100)+"meter");
		
		System.out.println("The length in Kilometer is " +((float)a/100000)+"KM");
	}

}
