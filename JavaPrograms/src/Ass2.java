import java.util.Scanner;
public class Ass2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number");
		int a=s.nextInt();
		System.out.println("enter second number");
		int b=s.nextInt();
		System.out.println("enter third number");
		int c=s.nextInt();

		if(a==13)
		{
			System.out.println("Sum:"+c);
		}
		else if (b==13)
		{
			System.out.println("Sum:"+a);
		}
		else if (c==13)
		{
			System.out.println("Sum:"+(a+b));
		}
		else
			System.out.println("Sum:"+(a+b+c));
	}

}
