package ArraysAndStringTask;

import java.util.Scanner;

//2. Write a program to array elements print all Even number
public class Task2 {
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
		System.out.println("Even numbers");
		for(int i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				System.out.printf("%d ",a[i]);
			}
		}
	}

}
