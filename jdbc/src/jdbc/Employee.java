package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class Employee {
	Connection con;
	private String empid;
	public String empname;
	public String dept;
	public String desg;
	public String email;
	public Employee() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mvc","root","root");
			System.out.println("Connection Successfull");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public Employee(String empid) {
		this.empid=empid;
		
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
		
 
}
