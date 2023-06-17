package classAssignment3;

import java.util.Scanner;

public class charCheck {

	public static void main(String[] args) {
		boolean vovel= false;
	char ch;
	Scanner scan = new Scanner(System.in);
	System.out.println(" type any character : ");
	ch = scan.next().charAt(0);
	
	switch(ch)
	{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U':  vovel=true;
	
	if(vovel==true)
	{
		System.out.println(" it is an vovel");
	}
	else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
	{
		System.out.println(" it is an consonant");
	}
	else 
	{
		System.out.println(" entered character is not an alphabet");
	}	
	}
   }
}
