package assignments;

import java.util.Scanner;

public class calculate {

	public static void main(String[] args) {
		int num1;
		int num2;
		double ans1;
		double ans2;
		double ans3;
		double ans4;
		double ans5;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 1st number : ");
		num1=scan.nextInt();
		System.out.println("enter 2nd number : ");
		num2=scan.nextInt();
		
		ans1 = num1 + num2;
		ans2 = num1 - num2;
		ans3 = num1 * num2;
		ans4 = num1 / num2;
		ans5 = num1 % num2;

		System.out.println("addition of " + num1 + " + " + num2 + " is : " + ans1);
		System.out.println("subtraction of " + num1 + " + " + num2 + " is : " + ans2);
		System.out.println("multiplication of " + num1 + "+ " + num2 + " is : " + ans3);
		System.out.println("division of " + num1 + " + " + num2 + " is : " + ans4);
		System.out.println("reminder of " + num1 + " + " + num2 + " is : " + ans5);
	}

}
