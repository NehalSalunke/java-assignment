package assignments;

import java.util.Scanner;

public class tempConversion {
	double Celsious;
	double F;

	public void conversion()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println(" temperature in celsious : ");
		Celsious = scan.nextDouble();
		
		F = (9 *Celsious + (32*5))/5;
		System.out.println("conversion from Celsius to Fahrenheit is : " + F);
	}

		public static void main(String[] args) {
			tempConversion obj = new tempConversion();
			obj.conversion();
		}
}
