package classWork;

class Public{
	int age = 5;
	
}
public class instanceVariable {
	
	public static void main(String[] args) {
		Public p1 = new Public();
		Public p2 = new Public();
		Public p3 = new Public();
		
		p1.age = 10;
		p2.age = 20;
		p3.age = 30;
		
		System.out.println(" age of p1 is " + p1.age);
		System.out.println(" age of p2 is " + p2.age);
		System.out.println(" age of p3 is " + p3.age);
	}
	

}
