
public class Demo implements Mathematics {
	
	public int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args)
	{
		Mathematics m=(a, b)->a+b;
		System.out.println(m.add(10, 12));
	   
	}


}
