
abstract class Parent
{
 void A()
 {
	 System.out.println("hello");
	 
 }
 abstract void B();
}
class Child extends Parent
{
	void B()
	{
		System.out.println("Abstract method defined");
	}
}
class AbstractEx
{
	public static void main(String[] args)
	{
	Child c=new Child();
	c.A();
	c.B();
	}
}