package Assignments;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Ass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=s.next();
		if(Pattern.matches("#[A-F0-9]{6}",s1))
		{
			System.out.println("Correct Pattern");
		}
		else
		{
			System.out.println("Incorrect Pattern");
		}
	}

}
