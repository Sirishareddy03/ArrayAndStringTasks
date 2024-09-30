package ArraysAndStringTask;

import java.util.Scanner;

//4. Write a program to search an element in an array
public class Task4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the searching element");
		int s=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
		   if(s==a[i])
		   {
			   System.out.println("the element is avilable");
		   }
		}
	}
}
