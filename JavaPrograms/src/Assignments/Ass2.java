package Assignments;
import java.util.Scanner;
public class Ass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=s.nextInt();
		while(a!=0)
		{
			
			int rem=a%10;
			a=a/10;
			if(rem%2!=0)
			{
				sum=sum+rem;
				
			}
			
		}
		System.out.println("Sum of odd numbers is : "+sum);
	}

}
