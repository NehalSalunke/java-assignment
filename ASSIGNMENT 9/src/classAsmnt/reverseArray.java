package classAsmnt;
import java.util.*;
public class reverseArray {

	public static void main(String[] args) {
		int arr[]= new int[5];
		int rev;
		System.out.println(" enter the elements to store in an array : ");
		for (int i = 0; i < arr.length; i++) {
			Scanner sc = new Scanner(System.in);
			arr[i]= sc.nextInt();
		}
		System.out.println(" before reversing array : " + arr[0]+ "  " + arr[1] +"  "+ arr[2] +"  "+
		arr[3] + "  "+ arr[4]);
		
		System.out.println(" after reversing array : ");
		for (int j = 4; j < arr.length; j--) 
		{
			System.out.print(arr[j]+ "	");
		}
	}
		
	}
