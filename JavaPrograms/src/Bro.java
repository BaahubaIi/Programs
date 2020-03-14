
class Bro {
	Bro()
		{
		System.out.println("From A");
		}
}
	 class B extends Bro
	{ 
		 B(int z)
		 {z=2;}
	public static void main(String args[])
	{ new B(3);}
}

