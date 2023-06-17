package classAssignment3;

import java.util.Scanner;

public class oddEven {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,0};
		System.out.println("Identifying odd and even numbers");
		for(int i=0; i<10; i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i] + " is even number");
			}
			else
			{
				System.out.println(a[i] + " is odd number");
			}
		}
		
		
	}

}
