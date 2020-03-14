import java.util.Scanner;

public class Ass10 {
		public static void main(String [] args)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter a string");
			String s1=s.nextLine();
			StringBuilder sb=new StringBuilder();
			sb.append(s1);
			String s2=(sb.reverse()).toString();
			
		if (s1.equals(s2))
		{
			System.out.println("palindrome");
		}
		else
			System.out.println("not a palindrome");
			
		}

	}

