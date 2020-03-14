//import java.io.Console;
import java.lang.reflect.Array;

public class MathOperation {

	public static void main(String[] args) {
		try {
		int sum=0;
		//Console c=System.console();
		//System.out.println("Enter array size");
		//int n=Integer.parseInt(c.readLine());
		int a[]=new int[args.length];
		//System.out.println("Enter array elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		    sum=sum+a[i];
		}
		System.out.println(sum);
		float avg=sum/a.length;
		System.out.println(avg);
		/*for(int i=0;i<n;i++)
		{
			sum=sum+a[i];
		}*/
//System.out.println("Sum of array elemnts is"+sum);
//System.out.println("Average of array elemnts is"+(sum/n));
	}
	catch(ArithmeticException e){
		System.out.println(e);
	}
		catch(NumberFormatException e){
			System.out.println(e);
		}

}
}