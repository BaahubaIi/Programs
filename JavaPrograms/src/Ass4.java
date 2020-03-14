import java.util.*;
public class Ass4 {
	/*public void test() {
		
		
		
		
	}*/
		public void sum() {
		int su=0;
		System.out.println("Enter any number");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		while(n!=0)
		{
			su=su+(n%10);
			n=n/10;
		}
		
		
		if (su>9)
		{
			while(su<10)
			{
				su=su+(n%10);
				n=n/10;
			}
			System.out.println("sum of the number is : "+su);
		}
}

	public static void main(String[] args) {
	
		Ass4 a=new Ass4();
		//a.test();
		a.sum();
		
	}
	}
