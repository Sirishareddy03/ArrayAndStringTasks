package ArraysAndStringTask;
//13.Write a program to check whether two String objects contain the same data

import java.util.Scanner;

public class Task13 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first string value ");
	String a=sc.next();
	System.out.println("Enter the second string value ");
	String b=sc.next();
	System.out.println("two String objects contain the same data");
	System.out.println(a.equals(b));
	
}
}
