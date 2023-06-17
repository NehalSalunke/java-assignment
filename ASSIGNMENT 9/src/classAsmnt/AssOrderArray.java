package classAsmnt;

import java.util.Scanner;

public class AssOrderArray {

	public static void main(String[] args) {
		int arr[]= new int[5];
		int asc;
		int min;
		int n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt()
		System.out.println(" create space fo array " + n);
		System.out.println(" enter elements for array : ");
		for (int i = 0; i < n; i++) {
				
			arr[i]= sc.nextInt();
		}
		System.out.println(" array is " );
		for (int i = 0; i< n; i++) {
			System.out.println("  ");
		}
		
		System.out.println("ascending order of an array is ");
		for(int j = 0; j < arr.length  ; j++) {
			if(arr[j]< arr.length){
			System.out.println(arr[j] + "	");
			}
		
		}
	}	
}
