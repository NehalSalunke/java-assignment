package classWork;

public class StudentExample {
	int stdID;
	String stdName;
	static String clgName = "CDAC Delhi";
	
	public static void changeClg() {
		clgName = "CDAC Noida";
	}
	
	StudentExample(int id, String name)  
	{
		stdID = id;
		stdName = name;
	}
	public void display()
	{
		System.out.println(stdID + "\t" + stdName +"\t" + clgName );
	}

	public static void main(String[] args) {
		
		StudentExample.changeClg();
		StudentExample std1 = new StudentExample(101, "rohan");
		StudentExample std2 = new StudentExample(102, "nisha");
		StudentExample std3 = new StudentExample(103, "priya");
		StudentExample std4 = new StudentExample(104, "dora");
		
		std1.display();
		std2.display();
		std3.display();
		std4.display();
	}

	}
