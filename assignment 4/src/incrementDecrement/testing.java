package incrementDecrement;

public class testing {

	public static void main(String[] args) {
		int a = 10;
		int b = a;
		
		 System.out.println("a1 : " + a);     //10
		 System.out.println("b1 : " + b);     //10
		 
		 b = a++;
		 System.out.println("a2 : " + a);     //11    post increment
		 System.out.println("b2 : " + b);     //10    
		 
		 b = ++a;
		 System.out.println("a3 : " + a);     //12    pre increment
		 System.out.println("b3 : " + b);     //12
		 
		 b = a--;
		 System.out.println("a4 : " + a);     //11    post decrement
		 System.out.println("b4 : " + b);     //12    
		 
		 b = --a;
		 System.out.println("a5 : " + a);     //10    pre decrement
		 System.out.println("b5 : " + b);     //10

	}

}
