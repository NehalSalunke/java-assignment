package classWork;

import java.util.Scanner;

public class middleNumber {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(" Enter first number : ");
		int a= scan.nextInt();
		System.out.println(" Enter last number");
		int b = scan.nextInt();
		 
		for(int i=a; i<=b; i++)
		{
			System.out.print("	"+i);
		} 
		System.out.println(" ");
		System.out.println(" middle number is : ");
		while(a!=b)
        {
        	a++;
        	b--;
        }
        System.out.println("  "+ a);
	}

}
