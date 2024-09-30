package ArraysAndStringTask;

import java.util.Scanner;

//19.Write a program to find maximum between two string

public class Task19 {
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first String  :");
		String a = input.nextLine();
		System.out.print("Enter the second String  :");
		String b = input.nextLine();
		int len1 = a.length();
		int len2 = b.length();
		if(len1>len2)
			System.out.println(a+" is Maximum String..");
		else if(len2>len1)		
			System.out.println(b+" is Maximum String..");
		else			
			System.out.println(a+" or "+b+" Both are Same Length");
	}
}
