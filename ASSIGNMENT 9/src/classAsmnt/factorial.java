package classAsmnt;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int num;
		double fact=1;
		
		System.out.println(" Enter a number to get it's factorial : ");
		Scanner sc = new Scanner(System.in);
		num= sc.nextInt();
		
		for (int i = num; i >0; i--) {
			fact=fact*i;
			
		}
			System.out.println("Factorial of "+num+ " is "+ fact);
	}

}
