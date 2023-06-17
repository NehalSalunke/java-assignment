package classAssignment3;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
	    int year;
	    System.out.println("Find out leap year by entering year below : ");
		Scanner scan = new Scanner(System.in);
		year= scan.nextInt();
		
		if (year%4==0)
		{
			System.out.println(" This is leap year...");
		}
		else
		{
			System.out.println(" This is not leap year...");
		}
		
	}

}
