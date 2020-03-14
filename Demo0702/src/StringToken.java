import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		
		StringTokenizer st = new StringTokenizer(s," ");
		while(st.hasMoreTokens())
		{
		String a=st.nextToken();
		String b=a.substring(a.length()-1);
		String c=b.toUpperCase();
		String output=new StringBuilder().append(c).append('$').toString();
		System.out.print(output);
		}
	
	}

}
