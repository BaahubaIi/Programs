package Assignments;
import java.util.Scanner;
public class Ass9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.next();
		 
		for(int i=0;i<s1.length();i++)
		{
		   if(Character.isDigit(s1.charAt(i))) //Enters loop if a numeric value is found in string
			  

		   {
			   sum=sum+Character.getNumericValue(s1.charAt(i)); //converts char into a int
		   }
	}
		System.out.println("Sum of digits in String : "+sum);

	}
}
