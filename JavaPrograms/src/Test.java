import java.util.Collections;
import java.util.LinkedList;

class Test
{
	public static void main(String[] args)
	{
		LinkedList list=new LinkedList();
		Student s1=new Student(30,"Suresh");
		Student s2=new Student(80,"Ramesh");
		Student s3=new Student(65,"Cherry");
		Student s4=new Student(50,"Hitesh");
		Student s5=new Student(89,"Venkat");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println(list);
		Collections.sort(list);
		list.forEach(System.out::println);
		Collections.reverse(list);
		System.out.println("After Reverse");
		list.forEach(System.out::println);
	}
}