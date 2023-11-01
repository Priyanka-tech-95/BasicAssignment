package myassignment;

import java.util.Scanner;

public class GreaterAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second number ");
		int b = sc.nextInt();
		
		System.out.print("Enter the Third number ");
		int c = sc.nextInt();
		
		int rs = (a>b)?(a>c ? a : c) : (b > c ? b:c );
		System.out.println("The greater number is "+rs);
		
	}

}
