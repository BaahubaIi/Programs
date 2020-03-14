import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Employee {
	static int id;
	static String desg;
	static int sal;

	public Employee(int id,String desg,int sal) 
	{
	  this.id=id;
	  this.desg=desg;
	  this.sal=sal;
	}
	
	public static Map increaseSalaries(int n,HashMap<Integer,String>h1,HashMap<Integer,Integer>h2)
	{
		HashMap<Integer,Integer> op= new HashMap<Integer,Integer>();
		Set keys=h1.keySet();
		Iterator itr=keys.iterator();
		while(itr.hasNext())
		{
			int id=(int)itr.next();
			String s=h1.get(id);
			if(s.equals("manager")) 
			{
				int newsal=h2.get(id)+5000;
				op.put(id,newsal);
			}
		}
		return op;
	}

		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e=new Employee(id, desg, id);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no of employees");
		int n=s.nextInt();
		HashMap<Integer,String> map1= new HashMap<Integer,String>(); 
		HashMap<Integer,Integer> map2= new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> res= new HashMap<Integer,Integer>();
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter your employee id : ");
		    int id = s.nextInt();  
		    System.out.print("Enter your designation : " );
		    String desg = s.next();
		    System.out.print("Enter your salary : ");
		    int sal = s.nextInt();    
		    map1.put(id, desg);
		    map2.put(id, sal);
		}
		
	  
	   res=(HashMap<Integer,Integer>) e.increaseSalaries(n, map1, map2);
	   System.out.println(res);
		
		

	}


	
	
}
