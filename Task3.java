package ArraysAndStringTask;
//3. Write a program to array elements print all Odd number

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Odd numbers");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.printf("%d ",a[i]);
			}
		}
	}
}
