package ForLoop;

public class nestedFor {

	public static void main(String[] args) 
	{

for(int i = 9; i>=1; i--)
	
    {
	for (int j = i; j>=1 ; j--) {
		System.out.print(" * \t");
	}
	System.out.println("");
	}
  for(int i= 1; i<=5; i++)
  {
	  for(int j= 1; j<=i; j++)
	  {
	  System.out.print(j);
	  }
	  System.out.println(" 	");
  }
	}
	
	

}
