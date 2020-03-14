import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.function.*;

class Student implements Comparable<Student>
{
	int marks;
	static String name;
	Student(int marks,String name)
	{
		this.marks=marks;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}
	
	public int CompareTo(Student student)
	{
		if(name.compareTo(student.name)<0)
			return -1;
		else if(name.compareTo(Student.name)>0)
			return 1;
		else 
			return 0;
	}
	@Override
	public int compareTo(Student arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}


