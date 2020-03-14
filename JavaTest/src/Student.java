
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
public class Student {
	String name;
	int marks;
	
	Student(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}

	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<Student>();
		Student s1=new Student("Venkat",99);
		Student s2=new Student("Aravind",98);
		Student s3=new Student("Chandhu",100);
		Student s4=new Student("Bumrah",13);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println("students who are passed:");
	Predicate<Student>p=s->s.marks>=40;
	Function<Student,String>f=stu->{
		int m=stu.marks;
		if(m>=80)
			return "Distinction";
		else if(m>=60 && m<=79)
			return "FirsT Class";
		else if(m>=40 && m<=50)
			return "Second class";
		else
			return "fail";
	};
	Consumer<Student>c=s->{
		
		System.out.print(s.name+"  ");
		System.out.println(f.apply(s));
	};
	for(Student s:list) {
		if(p.test(s))
		{
			c.accept(s);
		}
			
	}
	}

}
