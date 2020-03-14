import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max=0;
		String topper=null;
		Scanner s=new Scanner(System.in);
		ArrayList<String> al=new ArrayList<String>();
		System.out.println("Enter the number of students");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			al.add(s.next());
		}
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			String temp=(String)itr.next();
			StringTokenizer st = new StringTokenizer(temp,"-");
			String name=st.nextToken();
			int m1=Integer.parseInt(st.nextToken());
			int m2=Integer.parseInt(st.nextToken());
			int m3=Integer.parseInt(st.nextToken());
			int total=m1+m2+m3;
			if(total>max)
			{
				max=total;
				topper=name;
			}
		}
		System.out.println("First Rank Holder : "+topper);

	}

}
