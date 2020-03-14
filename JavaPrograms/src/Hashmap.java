import java.util.*;

class College
{
	String dep_code1,dep_code2,dep_code3;
	College(String dep1,String dep2,String dep3)
	{
		this.dep_code1=dep1;
		this.dep_code2=dep2;
		this.dep_code3=dep3;
	}
	@Override
	public String toString() {
		return "Hashmap [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,College> hm=new HashMap<String,College>();
		hm.put("JNTUH", new College("CSE","ECE","CIV"));
		hm.put("SVU", new College("MECH","CSE","CIV"));
		hm.put("KLU", new College("CSE","EEE","CIV"));
		hm.put("JNTUK", new College("CSE","ECE","IT"));
		Set entries=hm.entrySet();
		Iterator itr=entries.iterator();
		System.out.println("Enter the course you want");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		System.out.println("The course you want is offered by : ");
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			College i=(College)me.getValue();
			
			if(i.dep_code1.equals(a)||i.dep_code2.equals(a)||i.dep_code3.equals(a))
			{
				System.out.println(me.getKey());
			}
		}

	}

	

}
