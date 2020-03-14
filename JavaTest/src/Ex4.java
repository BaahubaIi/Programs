
import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
	
		public static ArrayList<Integer> performSetOperations(ArrayList<Integer> a1,ArrayList<Integer> a2, char c)
		{
		ArrayList<Integer> op1 = new ArrayList<Integer>();
	    int k = 0;
	    switch (c) 
	    {
	    	case '+':
	    		a1.removeAll(a2);
	    		a1.addAll(a2);
	    		op1 = a1;
	    		break;
	    	case '*':
	    		a1.retainAll(a2);
	    		op1 = a1;
	    		break;
	    	case '-':
	        for (int i = 0; i < a1.size(); i++) 
	        {
	        k = 0;
	        for (int j = 0; j < a2.size(); j++) 
	        {
	          if (a1.get(i) == a2.get(j))
	            k = 1;
	        }
	        if (k == 0)
	          op1.add(a1.get(i));
	        }
	          break;
	    }
	    return op1;
		
    }
	
  public static void main(String args[]) 
  {
        Ex4 e=new Ex4();
        Scanner sc = new Scanner(System.in);
	    System.out.println("Enter ArrayList Size");
	    int n = Integer.parseInt(sc.nextLine());
	    ArrayList<Integer> al1 = new ArrayList<Integer>();
	    ArrayList<Integer> al2 = new ArrayList<Integer>();
	    System.out.println("Enter elements in ArrayList1");
	    for (int i = 0; i < 2*n; i++)
	    {
	    al1.add(Integer.parseInt(sc.nextLine()));
	    }
	    System.out.println("Enter elements in ArrayList2");
	    for (int i = 0; i < 2*n; i++)
	    {
	    al2.add(Integer.parseInt(sc.nextLine()));
	    }
	    System.out.println("Enter your choice : '+' for SET-UNION, '*' for SET-INTERSECTION, '-' for SET-DIFFERENCE ");
	    char c = sc.nextLine().charAt(0);
        System.out.println("Resultant Arraylist : "+e.performSetOperations(al1,al2,c));
  }
}
