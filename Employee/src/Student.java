import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Student {
String subject;
int marks;
	public Student(String subject,int marks) {
		// TODO Auto-generated constructor stub
		this.subject=subject;
		this.marks=marks;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		SortedMap<Integer,String> map=new TreeMap<Integer,String>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of subjects");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter subject name");
			String subject=sc.next();
			System.out.println("Enter marks");
			int marks=sc.nextInt();
			map.put(marks, subject);
			
		}
		
		 Set<Integer> keys = map.keySet();
		 for(Integer key: keys){
	            sum=sum+key;
	        }

}
}