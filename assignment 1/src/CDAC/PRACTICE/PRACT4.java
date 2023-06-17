package CDAC.PRACTICE;

 class PRACT4 { //class 1

int length = 10;                    //declaration of variable
int width = 20;
int rectangle = length * width;
		public void area() //method
		{
			System.out.println("area of rectangle is:" + rectangle);
		}

	}
 class mainClass{ //class2
	 public static void main(String[] args)
	 {
		 System.out.println("here program starts!!!");
		 
		 PRACT4 obj = new PRACT4();
		 obj.area();             //calling the method
	 }
	 
	 
 }

