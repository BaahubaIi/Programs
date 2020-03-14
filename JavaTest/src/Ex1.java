import java.util.Scanner;

public class Ex1 {
	//Method to validate PAN number
public void CheckPan(String s)
{
	if(s.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
	{
	System.out.println("Valid PAN number");
	}
	else
	{
	System.out.println("Invalid PAN number");
	}
}

public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your 8 digit PAN number");
//Get Pan card number from user
String pan= sc.next();
//Create an object for the class
Ex1 e=new Ex1();
//Call the method using Class object
e.CheckPan(pan);
}
}