package classWork;
// get the number from user and print its table until 100 using while loop	
import java.util.Scanner;

public class whileLoop {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		 
		int sum= 0; 
				System.out.println("Enter the number  ");
		int num1 = scan.nextInt();
		while (sum<100)
		{
			sum = sum+ num1;
			System.out.println(" " + sum);
		}
	}
	}
