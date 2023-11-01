//1.	Write a C program to print day of week name using switch case.
package myassignment;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of day in a week (1-7) ");
		int d = sc.nextInt();
		
		switch(d) {
		case 1:
			System.out.println("First day of Week is Sunday");
			break;
		
		case 2:
			System.out.println("Second day of Week is Monday");
			break;
			
		case 3:
			System.out.println("Third day of Week is Tuesday");
			break;
			
		case 4:
			System.out.println("Fourth day of Week is Wednesday");
			break;
			
		case 5:
			System.out.println("Fifth day of Week is Thursday");
			break;
			
		case 6:
			System.out.println("Sixth day of Week is Friday");
			break;
			
		case 7:
			System.out.println("Seventh day of Week is Saturday");
			break;
		default :
			System.out.println("Number is out of Scope");
		}System.out.println("I am wise !!!");
	}

}
