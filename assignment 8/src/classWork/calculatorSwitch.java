package classWork;

import java.util.Scanner;

public class calculatorSwitch {

	public static void main(String[] args) {
		int i=1;
     float a, b, res =0;
     char choice;
     
	 do {

     System.out.println(" Enter the choice (1,2,3,4,5,6,7):");
     
     System.out.print(" 1. addition \n 2.substraction \n 3.multiplication"
     		+ " \n 4.division \n 5.average \n 6.power \n 7.quit");
     Scanner scan= new Scanner(System.in);
     choice = scan.next().charAt(0);
     
     switch(choice)
     {
     case 1:
     {
    	 System.out.println(" Enter the number " + i+ ":");
    	 a = scan.nextFloat();
    	 while(a!=0) {
         res=res+a;
    	 i++;
    	 }
    	 System.out.println(" Enter the number " + i+ ":");
    	 b = scan.nextFloat();
    	 
    	 //System.out.println(" sum of the numbers is :" res);
    	 }
     System.out.println(" sum :" + res);
     case 2:
     {
    	 System.out.println(" Enter the number " + i+ ":");
    	 a = scan.nextFloat();
    	 while(a!=0) {

         res=res-a;
    	 i++;
    	 }
    	 System.out.println(" Enter the number " + i+ ":");
    	 b = scan.nextFloat();
    	 
     }
     System.out.println(" subtraction :" + res);

     case 3:
     {
    	 System.out.println(" Enter the number " + i+ ":");
    	 a = scan.nextFloat();
    	 while(a!=0) {

         res=res*a;
    	 i++;
    	 }
    	 System.out.println(" Enter the number " + i+ ":");
    	 b = scan.nextFloat();
    	 
    	 System.out.println(" multiplication :" + res);
     }
     

     case 4:
     {
    	 System.out.println(" Enter the number " + i+ ":");
    	 a = scan.nextFloat();
    	 while(a!=0) {

         res=res/a;
    	 i++;
    	 }
    	 System.out.println(" Enter the number " + i+ ":");
    	 b = scan.nextFloat();
     }
     System.out.println(" division :" + res);
     case 5:
     {
    	 System.out.println(" Enter the number " + i+ ":");
    	 a = scan.nextFloat();
    	 while(a!=0) {

         res=res/a;
    	 i++;
    	 }
    	 System.out.println(" Enter the number " + i+ ":");
    	 b = scan.nextFloat();
    	 float avg = res/i;
     }
     System.out.println(" division :" + res);
     //case 6:
//     {
//    	 System.out.println(" enter the number ");
//    	 a= scan.nextFloat();
//    	 
//    	 System.out.println(" power = " + Math.pow(a, b));
//    	 
//    	 break;
//     }
     
	 case 7 :
	 {
     System.exit(0);
     break;
     }	
	 default :
		 System.out.println(" please enter correct choice");
     }
     System.out.println(" Do you want to continue? (Y/N) : ");
     choice = scan.next().charAt(0);
	 }
	 
	 while(choice=='Y' || choice=='y');
	 System.out.println(" Byee.. have a good day!");
     
}
}
