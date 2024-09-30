package ArraysAndStringTask;

import java.util.Scanner;

//7. Write a program to array elements print all Positive number
public class Task7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("size of the array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter tha array values");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("all positive number");
		for(int i=0;i<n;i++)
		{
			if(a[i]>=0)
			{
				System.out.printf("%d ",a[i]);
			}
		}
		
	}
}
