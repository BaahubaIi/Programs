package Assignments;
import java.util.Scanner;
public class Ass3 {
	public static void main(String[] args) {
	int sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=s.nextInt();
	while(a!=0)
	{
		
		int rem=a%10;
		a=a/10;
		if(rem%2==0)
		{
			sum=sum+(rem*rem);
			
		}
		
	}
	System.out.println("Sum of squares of even numbers is : "+sum);
}

}
