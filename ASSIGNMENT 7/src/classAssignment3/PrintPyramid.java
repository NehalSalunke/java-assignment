/*	Write a Java program to print the pyramid like below:
 1 
 2 2 
 3 3 3 
 4 4 4 4 
 5 5 5 5 5*/

package classAssignment3;

import java.util.Scanner;

public class PrintPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number of rows of the pyramid : ");
		int row = sc.nextInt();
		
		for(int i=0; i<=row; i++)
		{
			System.out.println(" ");
			for(int j =1; j<=i; j++)
			{
				System.out.print(i + "  ");
			}
		}
		
		}
		

	}

