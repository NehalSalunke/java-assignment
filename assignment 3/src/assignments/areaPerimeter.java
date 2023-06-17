package assignments;

public class areaPerimeter {
public void display()
{
	int length = 10;
	int width =20;
	double area;
	double perimeter;
	
	area = length * width;
	perimeter = 2 * (length + width);
	
	System.out.println("Area of rectangle is : " + area);
	System.out.println("Perimeter of rectangle is : " + perimeter);
}
	public static void main(String[] args) {
		areaPerimeter obj1 = new areaPerimeter();
		obj1.display();
				

	}

}
