package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Data.Emp;

public class EmployeeDao 
{
		public Connection getConnection() throws ClassNotFoundException, SQLException
		{
			Connection con=null;
			try 
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return con;
		}
		public int insertEmployee(Emp emp)
		{
			int result=0;
			try
			{
				Connection con=getConnection();
				String sql="insert into emp values(?,?,?,?,?)";
				PreparedStatement pst=con.prepareStatement(sql);
				pst.setInt(1,emp.getEmpid());
				pst.setString(2,emp.getEname());
				pst.setString(4,emp.getDept());
				pst.setString(3,emp.getDesg());
				pst.setString(5,emp.getEmail());
				result=pst.executeUpdate();
			}	
			catch(Exception e)
			{
				System.out.println(e);
			}
			return result;
		}
		public List<Emp> showEmployees()
		{
			List<Emp> list=new ArrayList<Emp>();
			try
			{
				Connection con=getConnection();
				Statement ps=con.createStatement();
				ResultSet rs=ps.executeQuery("select * from emp");
				while(rs.next())
				{
					Emp u=new Emp();
					u.setEmpid(rs.getInt(1));
					u.setEname(rs.getString(2));
					u.setDept(rs.getString(3));
					u.setDesg(rs.getString(4));
					u.setEmail(rs.getString(5));
					list.add(u);

				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			return list;
		}
		
	
	}