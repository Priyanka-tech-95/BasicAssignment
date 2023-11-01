//18.	Write a Java program to calculate profit or loss.
package myassignment;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Cost Price of Item");
		float a = sc.nextFloat();
		System.out.print("Enter the Sell Price of Item");
		float b = sc.nextFloat();
		
		if(b>a) {
			System.out.println("Profit "+(b-a)+"rupee");
			float p = ((b-a)/a)*100;
			System.out.println("Profit % is "+p);
			
		}else {
			System.out.println("Loss "+(b-a)+"rupee");
			float p = ((a-b)/a)*100;
			System.out.println("Loss % is "+p);
			
		}System.out.println("I am wise !!!");
	}

}
