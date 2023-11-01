//2.	Write a Java program to find maximum between three numbers.
package myassignment;

import java.util.Scanner;

public class GreaterAmongThreeIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the First number ");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second number ");
		int b = sc.nextInt();
		
		System.out.print("Enter the Third number ");
		int c = sc.nextInt();
		
		if((a>b)&&(a>c)){
			System.out.println(+a+" is greater number");
		}else if ((b>a)&&(b>c)) {
			System.out.println(+b+" is greater number");
		}else {
			System.out.println(+c+" is greater number");
		}
		
	}

}
