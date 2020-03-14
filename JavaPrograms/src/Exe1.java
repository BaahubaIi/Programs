import java.util.Scanner;
public class Exe1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	    try {
	    	System.out.println("Enter integer");
			String s1=s.next();
		    int a=Integer.parseInt(s1);
	    	int b=a*a;
	    	System.out.println("The square value is "+b);
	    }
	    catch(NumberFormatException e)
	    {
	    	System.out.println("Entered input is not a valid format for an integer.");
	    }

	}
}
