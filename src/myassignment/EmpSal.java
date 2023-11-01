/*20.	Write a Java program to input basic salary of an employee and calculate its Gross salary according to following:
Basic Salary <= 10000 : HRA = 20%, DA = 80%
Basic Salary <= 20000 : HRA = 25%, DA = 90%
Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
package myassignment;
import java.util.Scanner;
public class EmpSal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Basic Salary, I will tell your Gross Salary ");
		int bs = sc.nextInt();
		if(bs<=10000 && bs>=0) {
			float gs = (float)(bs+(bs*0.2)+(bs*0.8));
			System.out.println("Your Gross Salary is "+gs +" rupees");
		}else if(bs<=20000 && bs>=10001) {
			float gs = (float)(bs+(bs*0.25)+(bs*0.9));
			System.out.println("Your Gross Salary is "+gs +" rupees");
		}else if(bs>=20000) {
			float gs = (float)(bs+(bs*0.3)+(bs*0.95));
			System.out.println("Your Gross Salary is "+gs +" rupees");
		}else {
			System.out.println("Please enter your Basic Salary");
		}
	}

}
