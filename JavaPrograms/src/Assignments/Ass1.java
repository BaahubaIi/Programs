package Assignments;
import java.util.Scanner;
public class Ass1 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=s.next();
		//char[] ch=s1.toCharArray();
		int n=s1.length();
		for (int i=0;i<n;i++)
		{
			if (s1.charAt(i) != s1.charAt(n-1-i)) 
			{
					
				   System.out.println("Not a Palindrome");
			}
					
			else
			{
				System.out.println("Palindrome");
			}
		}
}
	

}