package ForLoop;

public class continueLoop {

	public static void main(String[] args) 
	{
		System.out.println(" even numbers from 1-10 are :: " );
	  for(int i=1; i<=10; i++)
	  {
		  if(i%2==1)
		  continue;
		  
		  System.out.println(" " + i);
	  }

	}

}
