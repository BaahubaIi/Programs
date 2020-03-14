import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Breader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		//InputStreamReader i=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 3 numbers");
		String s1=br.readLine();
		String s2=br.readLine();
		String s3=br.readLine();
		int a=Integer.parseInt(s1);
		int b=Integer.parseInt(s2);
		int c=Integer.parseInt(s3);
		System.out.println("Sum of numbers is : "+(a+b+c));
		System.out.println("Avg of numbers is : "+(a+b+c)/3);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
