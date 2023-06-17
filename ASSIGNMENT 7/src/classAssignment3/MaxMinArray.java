
// 2)	Write a Java program to print the maximum and minimum value of an integer array.

package classAssignment3;

import java.util.Scanner;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int[] arr;
		arr = new int[3];
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("write 1st element");
		arr[0]=scan.nextInt();
		
		System.out.println("write 2nd element");
		arr[1]=scan.nextInt();
		
		System.out.println("write 3rd element");
		arr[2]=scan.nextInt();
		
    // identifying the maximum number from the array
    if(arr[0]>arr[1] && arr[0]>arr[2])
    {
    	System.out.println(" 1st element from the array is maximum number");
    }
    else if(arr[1]>arr[2])
    {
    	System.out.println(" 2nd element af the array is maximum number");
    }
    else
    {
    	System.out.println(" 3rd element of the array is maximum number");
    }
   
	// identifying minimum number from the array
	if(arr[0]<arr[1] && arr[0]<arr[2]) 
	{
    	System.out.println(" 1st element from the array is minimum number");
    }
	else if(arr[1]<arr[2])
    {
    	System.out.println(" 2nd element af the array is minimum number");
    }
    else
    {
    	System.out.println(" 3rd element of the array is minimum number");
    }
	}
}







