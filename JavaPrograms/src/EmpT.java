import java.util.function.*;


class EmpT
{
	
	public static void main(String[] args)
	{
		Employee e1=new Employee("Venkat","CEO",150000,"Hyd");
		Employee e2=new Employee("Aravind","PAT",45000,"Bglr");
		Employee e3=new Employee("Chandu","HR",55000,"Chennai");
		Employee e4=new Employee("Dheeraj","DM",10000,"Hyd");
		Employee e5=new Employee("Dinesh","PM",53000,"Hyd");
		Employee e6=new Employee("Surya","PAT",50000,"Bglr");
		Employee e7=new Employee("Venkat R","Manager",50000,"Hyd");
		Employee e8=new Employee("Moka","HR",45000,"Chennai");
		Predicate<Employee> p1=emp->emp.desg.equals("Manager");
		//Predicate<Employee> p2=emp->emp.sal=50000;
		Predicate<Employee> p3=emp->emp.desg.equals("DM");
		
	}
}