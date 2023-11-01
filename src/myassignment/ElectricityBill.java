/*21.	Write a Java program to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill
*/
package myassignment;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the current reading on meter");
		float cr = sc.nextFloat();
		
		System.out.print("Enter the previous reading on meter");
		float pr = sc.nextFloat();
		
		float ar =cr-pr;
		if(ar>=0 && ar<=50) {
			float a = (float)( ar*0.50);
			float bill = (float)(a+( a*0.2));
			System.out.println("Your Electricity unit is "+ar+" and bill is "+bill+"rupee");
			
		}else if(ar>=51 && ar<=150) {
			float r=ar-50;
			float a = (float)( r*0.75)+25;
			float bill = (float)(a+( a*0.2));
			System.out.println("Your Electricity unit is "+ar+" and bill is "+bill+"rupee");
			
		}else if(ar>=151 && ar<=250) {
			float r=ar-100;
			float a = (float)( r*1.20)+100;
			float bill = (float)(a+( a*0.2));
			System.out.println("Your Electricity unit is "+ar+" and bill is "+bill+"rupee");
			
		}else if(ar>=251 ) {
			float r=ar-250;
			float a = (float)( r*1.50)+220;
			float bill = (float)(a+( a*0.2));
			System.out.println("Your Electricity unit is "+ar+" and bill is "+bill+"rupee");
			
		}else {
			System.out.println("Your current reading must be greater than previous unit");
		}System.out.println("I am wise !!!");
		
	}

}
