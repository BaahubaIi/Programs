import java.util.*;
public class ass7 
{
	public static void main(String[] args) 
	{
		int i=1,sum=0;
	Scanner s=new Scanner(System.in);
	System.out.println("enter number");
	int num=s.nextInt();
	while (i<=num)
	{
		sum=sum+i;
		i=i+2;
		
	}
	System.out.println("sum of odd numbers till given input is : "+sum);
    }
}