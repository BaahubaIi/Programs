
public class Student {
String name;
public Student(String name)
{
	System.out.println("Welcome "+name);
}
public Student(String name,int marks)
{
	System.out.println("Welcome "+name+" of Class "+marks);
}
public void getName() {
	System.out.println("Hello " +name);
}

public void setName(String name) {
	this.name = name;
}
public void entiProblem()
{
	System.out.println("What's your problem from Student");
}
}
