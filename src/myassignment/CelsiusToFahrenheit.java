/*8.	Write a C program to enter temperature in Celsius and convert it into Fahrenheit.*/
package myassignment;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temprature in Celsius");
		float c = sc.nextFloat();
		
		System.out.println("The  Temprature in Celsius : " +c +"Celsius");
		System.out.println("The  Temprature in Fahrenheit : " +((c*9/5)+32) +"Fahrenheit");
	}

}
