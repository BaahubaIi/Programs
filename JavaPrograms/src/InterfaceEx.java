interface Car
{
	
	void acceleration();
	/*void engine();
	default void safety() {
		
	}
	static void mfgCountry() {
		System.out.println("Made in India");
	}*/
}
/*class Hyundai implements Car
{
	public void acceleration() {
		System.out.println("Hyundai Speed : 50kmph");
	}
	public void engine()
	{
		System.out.println("Hyundai Engine Model : 2019");
	}
	public void safety() {
		System.out.println("Safety is not our Priority");
	}
	
}
class Honda implements Car
{
	public void acceleration()
	{
		System.out.println("Honda speed:25kmph");
	}
	public void engine()
	{
		System.out.println("Honda Engine Model : 2015");
	}
}
*/public class InterfaceEx {
public static void main(String[] args)
{
	Car c=()->System.out.println("Safety is our Priority");
	c.acceleration();
	/*Car.mfgCountry();
	Hyundai h=new Hyundai();
	h.acceleration();
	h.engine();
	h.safety();
	Honda h1=new Honda();
	h1.engine();
	h1.safety();*/
}
}
