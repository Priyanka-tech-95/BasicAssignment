//17.	Write a Java program to find all roots of a quadratic equation.
package myassignment;

import java.util.Scanner;

public class SqRtQuadEq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ax^2 + bx + c = 0
		//x = (-b ± √ (b^2 - 4ac) )/2a
		// D = b^2 - 4ac
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a for quadratic equation");
		int a = sc.nextInt();
		System.out.print("Enter value of b for quadratic equation");
		int b = sc.nextInt();
		System.out.print("Enter value of c for quadratic equation");
		int c = sc.nextInt();
		if((a!=0)&&(b!=0)&&(c!=0)) {
			System.out.println("Equation is "+a+"x^2+"+b+"x+"+c);
			float d = b*b - 4*a*c;
			float x = (float)((-b) + Math.sqrt(d));
			x=x/(2*a);
			float y = (float)((-b) - Math.sqrt(d));
			y=y/(2*a);
			if(d>0) {
				System.out.println("Equation have two real and different root");
			System.out.println("First root is "+x+" Second root is "+y);
			
			}else if(d<0) {
				System.out.println("Equation have two imaginary and different root");
				System.out.println("First root is "+x+" Second root is "+y);
			}else {
				System.out.println("Equation have one real root");
				System.out.println(" root is "+x);
			}
			}else {
			System.out.println("Please enter non zero value");
		}
		
	}

}
