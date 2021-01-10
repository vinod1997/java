package Task2;

import java.util.Scanner;

public class DateFormat {

	public static void main (String[]args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String input=sc.nextLine();
		//int m=Integer.parseInt(input.substring(2,3));
		//int d=Integer.parseInt(input.substring(4, 5));
		
		Implementation i =new Implementation();
		i.maleOrFemale("970921-0224");
	}
}	