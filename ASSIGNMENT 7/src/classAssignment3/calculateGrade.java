package classAssignment3;

import java.util.Scanner;

public class calculateGrade {

	public static void main(String[] args) {
		int sub1;
		int sub2;
		int sub3;
		int sub4;
		int sub5;
		int avg;
		Scanner scan = new Scanner(System.in);
			System.out.println(" subject 1");
			sub1 = scan.nextInt();
		    
			System.out.println(" subject 2");
			sub2 = scan.nextInt();
			
			System.out.println(" subject 3");
			sub3 = scan.nextInt();
			
			System.out.println(" subject 4");
			sub4 = scan.nextInt();
			
			System.out.println(" subject 5");
			sub5 = scan.nextInt();
		
			avg= (sub1+ sub2+ sub3+ sub4+ sub5) / 5;
			System.out.println(" average marks of student is " + avg);
			
			if(avg>=80)
			{
				System.out.println(" The student got A grade");
			}
			else if(avg<80 && avg>=60)
			{
				System.out.println(" The student got B grade");
			}
			else if(avg<60 && avg>=40)
			{
				System.out.println(" The student got C grade");
			}
			else {
				System.out.println(" We are Sorry !!!!! your average score is less than 40");
			}
	}
}
