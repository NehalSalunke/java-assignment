package classWork;

public class FindIndex {
	
	public static int ArrayIndex (int[] marks, int t) {
        if (marks == null) return -1;
        int len = marks.length;
        int i = 0;
        while (i < len) {
            if (marks[i] == t) return i;
            else i=i+1;
        }
        return -1;
}
	public static void main(String[] args) {
		
		int[] marks = {46,41,12,55,43};
	      System.out.println("Index position of 79 is: " + ArrayIndex(marks, 41));
	      System.out.println("Index position of 90 is: " + ArrayIndex(marks, 45));
	}

}
