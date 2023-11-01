//5.	Write a java program to check whether character is an alphabet or not using conditional operator.
package myassignment;

import java.util.Scanner;

public class AlphabetOrNotConOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any Character ");
		char ch = sc.next().charAt(0);
		boolean tf = (ch> 'a' && ch < 'z' )||(ch>'A' && ch<'Z')? true :false ;
		if (tf == true) {
			System.out.println("Character is an alphabet ");
		}else {
			System.out.println("Character is not an alphabet");
		}
		
	}

}
