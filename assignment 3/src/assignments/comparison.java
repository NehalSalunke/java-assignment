package assignments;

import java.util.Scanner;

public class comparison {

	public static void main(String[] args) {
	int a;
	int b;
	int c;
	int d;
	
	  Scanner scan = new Scanner(System.in);
	  
	  System.out.println("enter values to be compared");
	  a = scan.nextInt();
	  b = scan.nextInt();
	  c = scan.nextInt();
	  d = scan.nextInt();
	  
	  if(a==b && b==c && c==d) {
		  System.out.println("all entered values are equal");
	  }
	  else {
		  System.out.println("entered values are not equal");
	  }
	}
}
