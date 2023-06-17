package classAssignment3;

public class printPyramid1 {

	public static void display() {
		int n = 5;
	for (int i=0; i<n; i++)
    {
        for (int j=n-i; j>1; j--)
        {
            System.out.print(" ");
        }
        for (int j=0; j<=i; j++ )
        {
            System.out.print("* ");
        }
        System.out.println();
    }
	}
	public static void main(String args[])
{
    
    printPyramid1 obj = new printPyramid1();
    obj.display();
}
}
