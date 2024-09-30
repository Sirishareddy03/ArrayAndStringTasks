package ArraysAndStringTask;

import java.util.Scanner;

//8. Write a program to calculate the average value of array elements
public class Task8 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of the array");
	int n=sc.nextInt();
	int a[]=new int[n];
	int sum=0;
	System.out.println("enter the elements of the array");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	System.out.printf("average value of array elements : %d",sum/n);
}
}
