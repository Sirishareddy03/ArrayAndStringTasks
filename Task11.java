package ArraysAndStringTask;
//11.Write a program to get the canonical representation of the string object
public class Task11 {
	public static void main(String[] args)
	{
		String s1 = "Java script";
		String s2 = new StringBuffer("Java").append(" script").toString();
		String s3 = s2.intern();
 
		System.out.println("str1 == str2 ? " + (s1 == s2));
		System.out.println("str1 == str3 ? " + (s1 == s3));
	
}
}
