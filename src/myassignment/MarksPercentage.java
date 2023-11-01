/*19.	Write a Java program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. Calculate percentage and grade according to following:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
*/

package myassignment;

import java.util.Scanner;

public class MarksPercentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of Physics ");
		int a = sc.nextInt();
		
		System.out.print("Enter the marks of Chemistry ");
		int b = sc.nextInt();
		
		System.out.print("Enter the marks of Biology  ");
		int c = sc.nextInt();
		
		System.out.print("Enter the marks of Math ");
		int d = sc.nextInt();
		

		System.out.print("Enter the marks of Computer ");
		int e = sc.nextInt();
		
		float m = (float)(a+b+c+d+e)/5;
		System.out.println("Percentage marks is :" +m+"%");
		if(m>=90 && m<=100) {
			System.out.println("Your grade is 'A'");
		}else if(m>=80 && m<=89) {
			System.out.println("Your grade is 'B'");
		}else if(m>=70 && m<=79) {
			System.out.println("Your grade is 'C'");
		}else if(m>=60 && m<=69) {
			System.out.println("Your grade is 'D'");
		}else if(m>=50 && m<=59) {
			System.out.println("Your grade is 'E'");
		}else if(m>=40 && m<=49) {
			System.out.println("Your grade is 'F'");
		}
	}

}
