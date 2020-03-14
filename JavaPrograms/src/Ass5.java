import java.util.Scanner;
public class Ass5 {
public static void main(String[] args)
{
	int sum=0,rev=0;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter no of array elemnts");
	int m=s.nextInt();
	int a[]=new int [m];
	System.out.println("Enter array elemnts");
	for(int i = 0; i < m; i++)
    {
        a[i] = s.nextInt();
    }
	System.out.println("Enter any number");
	int n=s.nextInt();
	for (int i=0;i<m;i++)
	{
		if (a[i]>n)
		{
			sum=sum+a[i];
		}
		
	}
	System.out.println("Sum of array elements greater than given number :"+sum);
	while(sum!=0)
	{
		int j=(sum%10);
		rev=rev*10+j;
		sum=sum/10;
		
	}
	System.out.println("Reversed number of the sum obtained is :"+rev);
}
}
