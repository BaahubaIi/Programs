
public class Person {
String name;
int age;
Address address;
Person(String name,int age,Address address)
{
this.name=name;
this.age=age;
this.address=address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + "]";
}
	

}
