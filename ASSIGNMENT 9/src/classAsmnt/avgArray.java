package classAsmnt;

import java.util.Scanner;

public class avgArray {

	public static void main(String[] args) {
		int arr[]= new int[5];
		int sum=0; int avg;
		System.out.println(" enter the elements of an array : ");
		for (int i = 0; i <5; i++) {
			Scanner sc= new Scanner(System.in);
			arr[i]= sc.nextInt();
			sum = sum + arr[i]; 
		}
		    avg = sum/5;
			System.out.println("average of elements in array is " + avg);
	}

}
