package incrementDecrement;

public class problem1 
{

	public static void main(String[] args) 
	{
		int a = 50;
		int b = a;
		
		a++;  // 51
		--a;  // 50
		a--;  // 49 
		a--;  // 48
		++a;  // 49
				
		b = a++;
		
		System.out.println("a : " + a);    // 50
		System.out.println("b : " + b);   //49
	}

}
