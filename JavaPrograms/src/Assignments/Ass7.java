package Assignments;
import java.util.Scanner;
public class Ass7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,max = 0;
       Scanner s=new Scanner(System.in);
       System.out.println("Enter array size");
       int n=s.nextInt();
       int a[]=new int[n];
       System.out.println("Enter array elements");
       
       for(i=0;i<n;i++)
       {
    	   a[i]=s.nextInt();
       }
       for (i=0;i<n;i++)
	   {
	   if(a[i]>max)
	   {
		   max=a[i];
	   }
	   }
       int min=a[0];
       for (i=0;i<n;i++)
	   {
	   if(a[i]< min)
	   {
		   min=a[i];
	   }
	   }
       if (n==1)
       {
    	   System.out.println(a[0]);
       }
       else
       {
    	   System.out.println("difference between the largest and smallest elements in the array:"+(max-min));
       }
	}

}
