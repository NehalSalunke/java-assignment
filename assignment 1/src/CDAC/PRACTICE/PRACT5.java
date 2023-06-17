package CDAC.PRACTICE;
import java.util.*;
public class PRACT5 {                // class1

int length;
int width;
int rec;
      public void areaRec()         // method
      {
	   Scanner scan= new Scanner(System.in);                   // scanner to get input
	   System.out.println("enter length of rectangle here :");
	   length = scan.nextInt();
	   System.out.println("enter width of rectangle");
	   width = scan.nextInt();
	   rec = length * width;
	   System.out.println("area of rectangle is :" + rec);
	  }
	}
class main                        //  class 2 
{
	public static void main(String[] args) {
		System.out.println("areas of rectangle and circle will be shown below :");
		
		PRACT5 obj = new PRACT5();        //creating object
		obj.areaRec();                    //calling method with the help of object
		circle obj2 = new circle();
		obj2.areaCir();
	
}
}
 class circle{                            // class 3
	 double radius;
	 double cir;
	 public void areaCir()
	 {
		 Scanner scan2 =new Scanner(System.in);             //scanner to accept values
		 System.out.println(" Enter radius of circle");
		 radius = scan2.nextInt();
		 cir = 3.14 * radius * radius;
		 System.out.println("area of circle is " + cir);
		 
	 }
 }
 
  /* class 1 [public class name();] 
   * variables declaration
   * method [public void name2();]
   * scanner (if needed) [Scanner object = new Scanner(System.in);]
   * accepting and storing values from user in variables. 
     [variable_name = object.next_variable datatype();]
   * all content
   * class 2 [public static void main(String() args);]
   * object creation of class 1 [class_name object = new class_name();]
   * calling of class 1 [object.method();]
   * */
