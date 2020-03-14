package temp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int SumOfOddsAndEvens(int n){

		int n1,n2=0,n3 = 0;

		while(n!=0)

		{

		n1=n%10;

		if((n1%2)!=0)

		n2+=n1;

		n/=10;

		}

		if(n2%2==0)

		System.out.println("even");

		else

		System.out.println("odd");
		return n3;

		}

		public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter an integer");
		int n=Integer.parseInt(br.readLine());
		System.out.print(SumOfOddsAndEvens(n));

}
}
