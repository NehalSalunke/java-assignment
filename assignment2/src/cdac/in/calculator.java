package cdac.in;
import java.util.*;
public class calculator {
	
public static void main(String[] args)
{
	
	char object;
	double num1;
	double num2;
	double res; 
	

	System.out.println("-------------------------------------------");
	System.out.println("		press + fpr addition");
	System.out.println("		press - for subtraction");
	System.out.println("		press * for multiplication");
	System.out.println("		press / for division");
	System.out.println("-------------------------------------------");
	
	Scanner sc = new Scanner(System.in);
    
	object = sc.next().charAt(0);
	
	System.out.println("enter value for num1 : ");
    num1 = sc.nextDouble();
    
    System.out.println("enter value for num2 : ");
    num2= sc.nextDouble();
    
    switch (object)
    {
    case '+' :
    	res = num1 + num2;
    	System.out.println("addition  :" + res);
    	break;
    	
    case '-' :
    	res = num1 - num2;
    	System.out.println("subtraction :" + res);
    	break;
    	
    case '*' :
    	res = num1 *num2;
    	System.out.println("multiplication : " + res);
    	break;
    	
    case '/' :
    	//res = num1 / num2;
    	//System.out.println("division : " + res);
    	//break;
    	
    default :
    System.out.println("sorry enter valid symbol");
    }
}
}
