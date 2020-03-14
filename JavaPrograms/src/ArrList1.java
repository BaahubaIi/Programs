import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrList1 {

	public static void main(String[] args) {
		ArrayList ar=new ArrayList();
		ArrayList ar2=new ArrayList();
		ar.add("Yellow");
		ar.add("Red");
		ar.add("Green");
		ar.add("Black");
		ar.add("White");
		ar2.add("hyd");
		ar2.add("blr");
	/*3*/	ar.add(0,"Rose");
		//System.out.println(ar);
	/*2*/	Iterator i=ar.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		System.out.println("Element at specific position");
	/*4*/	System.out.println(ar.get(3));
	/*11*/ar.set(0, "Brown");
	/*6*/ar.remove(3);
	/*7*/System.out.println(ar.contains("Green"));
	
	
	/*9*/System.out.println(ar.subList(2,4));
	/*10*/ar.addAll(ar2);	
	System.out.println(ar);
	Collections.sort(ar);
	System.out.println(ar);
	}

}
