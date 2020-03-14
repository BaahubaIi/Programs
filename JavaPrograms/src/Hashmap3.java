import java.util.*;
public class Hashmap3 {
	public static void main(String[] args)
	{
		HashMap<Object,Integer> hm=new HashMap<Object,Integer>();
		ArrayList<Integer> ar=new ArrayList<Integer>();
		Set<Integer> s=new HashSet<Integer>();
		PriorityQueue<Integer> q=new PriorityQueue<Integer>();
		ar.add(35);
		ar.add(42);
		s.add(11);
		s.add(12);
		q.add(3);
		q.add(5);
		hm.put(ar, 0);
		hm.put(s, 1);
		hm.put(q,2);
		Set set=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			Collection n=(Collection)me.getValue();
			System.out.println(n);
		
	}
	}
}
