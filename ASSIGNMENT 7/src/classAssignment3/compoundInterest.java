package classAssignment3;

import java.util.Scanner;

public class compoundInterest {

	public static void main(String[] args)
	{
		
		int p;
		double r;
		int n;
		double CI;
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter principal amount P : ");
		p = scan.nextInt();
		 System.out.println(" enter rate of interest R : ");
		 r = scan.nextDouble();
		 System.out.println(" enter the time period n : ");
		 n = scan.nextInt();
		 
		CI = p * (Math.pow((1 + r / 100), n)) - p;
		System.out.println(" Compound interest is : " +  CI);
	}
}
 