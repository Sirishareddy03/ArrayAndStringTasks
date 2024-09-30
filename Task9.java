package ArraysAndStringTask;

import java.util.Scanner;

//9. Write a program in to find the sum of all elements of the array
public class Task9 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("size of the array ");
	int n=sc.nextInt();
	int a[]=new int[n];
	int sum=0;
	System.out.println("Enter tha array values");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
			sum=sum+a[i];
	
	}System.out.printf("sum of all elements of the array = %d",sum);
}
}
