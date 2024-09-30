package ArraysAndStringTask;

import java.util.Scanner;

//1. Write a program to copy the elements of one array into another array
public class Task1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=a[i];
		}
		System.out.println("copy elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.printf("%d ",a[i]);
		}
		
	}

}
