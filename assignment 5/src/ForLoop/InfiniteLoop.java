package ForLoop;

public class InfiniteLoop {

	public static void main(String[] args) 
	{
		for(int i=10; i<=10; i--)
		 {
			System.out.println(i);
			
		 }
		Infinite obj = new Infinite();
		obj.display();
	}
public class Infinite
{
	 public void display() 
	 {
	   for(int j=1; j>1 ; j++)
		{
		  System.out.println("CDAC");
		}
	 }
}
}
