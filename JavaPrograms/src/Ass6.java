import java.util.*;
class Ass6 {
void test() {
	 
	 Scanner s=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=s.nextLine();
		System.out.println("Enter second string");
		String s2=s.nextLine();
		System.out.println("Enter a number");
		int n=s.nextInt();
		int m=s2.length();
		char x=s1.charAt(n);
		char y=s2.charAt(m-n);
		Character c1=new Character(x);
		Character c2=new Character(y);
		System.out.println(c1.equals(c2));
}
		/*if (c1.equals(c2))
		{
			return true;
		}
		else
			return false;
	}*/
 
	public static void main(String[] args) {
		
Ass6 a=new Ass6();
a.test();
}
}