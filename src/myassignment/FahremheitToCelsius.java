package myassignment;

import java.util.Scanner;

public class FahremheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Temprature in Fahrenheit");
		float f = sc.nextFloat();
		
		System.out.println("The  Temprature in Fahrenheit : " +f +"Fahrenheit");
		System.out.println("The  Temprature in Celsius : " +((f-32)*0.55) +"Celsius");
	//why 9/5 is always giving 0 result.
	}

}
