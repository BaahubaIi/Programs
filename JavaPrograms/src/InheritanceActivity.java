class Emp
{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;

	
	Emp(long id,String name,String address, long phone)		
	{
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
	}
	
	public void calculateSalary()
	{
		double salary = basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * Hra/100);
		System.out.println(salary);
		//return salary;
	}
	void calculateTransportAllowance()
	{
		double transportAllowance=10/100*basicSalary;
		System.out.println("Transport Allowance : "+transportAllowance);
	}
}

class Manager extends Employee
{
	

	Manager(long id,String name,String address, long phone,double salary)
	{
		super(id,name,address,phone);
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		this.basicSalary=salary;
	}
	
}
class Trainee extends Employee
{
	Trainee(long id,String name,String address, long phone,double salary)
	{
		super(id,name,address,phone);
		this.employeeId=id;
		this.employeeName=name;
		this.employeeAddress=address;
		this.employeePhone=phone;
		this.basicSalary=salary;
	}
}
public class InheritanceActivity {

	public static void main(String[] args) {
		Manager m=new Manager(126534,"Peter","Chennai India",237844,65000);
		m.calculateSalary();
		Trainee t=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		t.calculateSalary();
		
	}

}
