//4.	Write a java program to check whether a number is divisible by 5 and 11 or not.
package myassignment;

import java.util.Scanner;

public class CheckDivisiblity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number . I will tell you .. number is divisible by 5 and 11 or not  ");
		int a = sc.nextInt();
		
		if(a%5 == 0 && a%11 == 0) {
			System.out.println(+a+" is divisible by 5 and 11");	
			}else {
				System.out.println(+a+" is not divisible by 5 and 11");
			}System.out.println("I am wise !!!");

	}

}
