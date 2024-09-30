package ArraysAndStringTask;

import java.util.Scanner;

//5. Write a program to array elements to print sum of Negative Numbers
public class Task5 {
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
			if(a[i]<0)
			{
				sum=sum+a[i];
			}
		}System.out.printf("sum of the negative numbers = %d",sum);
		
	}

}
