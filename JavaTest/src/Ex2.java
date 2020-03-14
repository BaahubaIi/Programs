import java.util.Scanner;

public class Ex2 {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		//Gets age from user
		int age=sc.nextInt();
		
		try {
			//if age is negative, throws InvalidAgeException
			if (age<0)
			{
				throw new InvalidAgeException("Age can't be negative");  
			}
			//if age is <18, throws InsufficientAgeException
			else if(age>0&&age<18)
			{
				throw new InsufficientAgeException("You must be atleast 18 years old to vote");
			}
			else
			{
				System.out.println("Eligible for voting");
			}
			}
		//catch block having 2 Exceptions
		 catch(InvalidAgeException|InsufficientAgeException m)
		 {
			 System.out.println("Exception occured: "+m);
		 }
		
	}

}