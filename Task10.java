package ArraysAndStringTask;

import java.util.Scanner;

//10.Write a program to merge two arrays elements to store third array
public class Task10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		System.out.println("Enter first array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter second array elements");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("merged array");
		for(int i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
			System.out.printf("%d ",c[i]);
		}
	}
}
