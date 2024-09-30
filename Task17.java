package ArraysAndStringTask;

import java.util.Scanner;

//17.Write a program to Count Number of Uppercase and Lowercase letters
public class Task17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the strings");
	String s=sc.nextLine();
    char a[]=s.toCharArray();
    int u=0;
    int l=0;
    for(int i=0;i<s.length();i++)
    {
    	if(a[i]>=97 && a[i]<=122)
    	{
    		u++;
    	}
    	else if(a[i]>=65 && a[i]<=90)
    	{
    		l++;
    	}
    }
    System.out.printf("count of upper case letters :%d\n",u);
    System.out.printf("count of lower case letters :%d",l);
}
}
