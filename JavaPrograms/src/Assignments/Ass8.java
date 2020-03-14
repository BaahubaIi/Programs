package Assignments;
import java.util.Scanner;
public class Ass8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=s.nextInt();
		for(int i=1;i<n;i=+2)
		{
			sum=i+(i+2)-(i+4);
		}
System.out.println(sum);
	}

}
