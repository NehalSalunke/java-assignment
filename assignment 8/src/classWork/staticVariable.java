package classWork;

class person
{
	static int age = 15;	
}
public class staticVariable {

	public static void main(String[] args) {
		person p1 = new person();
		person p2 = new person();
		person p3 = new person();
		
		p1.age = 25;
		p2.age = 55;
		p3.age = 20;
		
		
		System.out.println(" age of p1 is : " + p1.age);
		System.out.println(" age of p2 is : " + p2.age);
	    System.out.println(" age of p3 is : " + p3.age);
	}
}
