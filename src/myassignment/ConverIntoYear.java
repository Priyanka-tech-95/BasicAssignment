package myassignment;

import java.util.Scanner;

public class ConverIntoYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of days");
		int d = sc.nextInt();
		
		int y = d/365;
		int r = d%365;
		int w = r/7;
		int rd = r%7;
		
		System.out.println("Number of year : " +y +" Number of week : " +w +" and number of day" +rd);
	}

}
