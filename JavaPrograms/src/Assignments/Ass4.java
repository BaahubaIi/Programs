package Assignments;
import java.util.Scanner;
public class Ass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String s1=s.next();
		System.out.println("Enter a number");
		int n=s.nextInt();
		int a=s1.length();
		String s2=s1.substring(0,n);
		String s3=s1.substring(a-n,a);
		if(n<a/2)
		{
	       System.out.println(s2.concat(s3));
		}
		else
		{
			System.out.println("Not Possible");
		}

	}

}


