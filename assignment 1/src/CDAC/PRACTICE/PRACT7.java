package CDAC.PRACTICE;
import java.util.*;
public class PRACT7 
    {
 public void display() 
  {
	int a;
	int b;
    int sum;
    int sub;
    int mul;
    double div;
    double mod;
    
    Scanner obj1 = new Scanner(System.in);
    System.out.println(" enter 1st value : ");
    a = obj1.nextInt();
    System.out.println("enter 2nd value : ");
    b = obj1.nextInt();
    
    sum = a+b;
    sub = a-b;
    mul = a*b;
    div = a/b;
    mod = a%b;
    
    System.out.println("addition of two numbers is :" + sum);
    System.out.println("subtraction of two numbers is : "+ sub);
    System.out.println("multiplication of two numbers : "+ mul);
    System.out.println("division of two numbers : "+ div);
    System.out.println("reminder of two numbers : " + mod);
    
  }
    }

 class main1 
{
    public static void main(String[] args) 
    {
	System.out.println(" weolcome here!!! your required results will display soon.");
	PRACT7 src = new PRACT7();
	src.display();
    }
}
// create 2 classes
//get 2 values
// print sum sub mul and div

