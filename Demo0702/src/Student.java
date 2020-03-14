import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.*;

public class Student implements Comparable<Student> {
	String name;
	Integer age;
	String city;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	Student(String name,int age,String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	public int compareTo(Student stu) {
		if(age.compareTo(stu.age)<0) {
			return 1;
		}
		else if(age.compareTo(stu.age)>0) {
			return -1;
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ar=new ArrayList<Student>();
		Student s1=new Student("venkat",21,"hyd");
		Student s2=new Student("aravind",23,"kurnool");
		Student s3=new Student("chandhu",101,"ongole");
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		 Collections.sort(ar);
		 ar.forEach(System.out::println);
}
}