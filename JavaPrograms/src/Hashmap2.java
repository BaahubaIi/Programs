import java.util.*;
public class Hashmap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		ArrayList<String> ar=new ArrayList<String>();
		hm.put(1001, "VenkaT");
		hm.put(1002, "Aravind");
		hm.put(1001, "double");
		hm.put(1001, "cHand");
		hm.put(1001, "dinesH");
		Set s=hm.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			Map.Entry me=(Map.Entry)i.next();
			String str=(String)me.getValue();
			if(str.charAt(0)>=97 &&str.charAt(0)<=122 
					&& str.charAt(str.length()-1)>=65 && str.charAt(str.length()-1)<=90)
			{
			ar.add(str);
			}
		}
		for(String c:ar)
		{
		System.out.println(c);

	}}

}
