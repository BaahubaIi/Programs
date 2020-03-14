class Employee
{
	String name; 
	String desg;
	float sal;
	String city;
	Employee(String name, String desg,float sal,String city)
	{
		super();
		this.name=name;
		this.desg=desg;
		this.sal=sal;
		this.city=city;
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", desg=" + desg + ", sal=" + sal + ", city=" + city + "]";
	}
	public boolean equals(Object obj)
	{
		Employee e=(Employee)obj;
		if(desg.equals(e.desg) && name.equals(e.name) && sal==e.sal && city.equals(e.city))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

