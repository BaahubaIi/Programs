import java.util.Scanner;
public class Exe2 {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	try {
		System.out.println("Enter array size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter the index of element you want to know");
		int b=s.nextInt();
		System.out.println("The array element at index "+b+"="+a[b]);
	}
       catch(ArrayIndexOutOfBoundsException e)
	{
    	   System.out.println(e);
	}
	}

}
