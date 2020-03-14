import java.util.Scanner;
public class Ass3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string");
		String s1=s.nextLine();
		StringBuilder sb=new StringBuilder();
		sb.append(s1);
		if(s1.charAt(0)=='j')
		{
			String s2=(sb.deleteCharAt(1)).toString();
				System.out.println(s2);
			
		}
		else if(s1.charAt(1)=='b')
		{
			String s3=(sb.deleteCharAt(0)).toString();
			System.out.println(s3);
		
	}
		else {
			
			System.out.println(s1.substring(2));
		}
		
	}
}


