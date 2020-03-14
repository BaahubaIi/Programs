
import java.sql.*;
import java.util.Scanner;
public class JdbcEx3 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies","root","root");
		//String query="insert into test values(?,?,?)";
		String query="select * from test where id=?";
		PreparedStatement pst=connection.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		/*System.out.println("Enter name ");
		String name=sc.next();
		System.out.println("Enter city ");
		String city=sc.next();*/
		pst.setInt(1, id);
		//pst.setString(2,name);
		//pst.setString(3,city);
		//int x=pst.executeUpdate();
		
		ResultSet rs=pst.executeQuery();
		while(rs.next()){  
			System.out.println("Name : "+rs.getString(2)+" City : "+rs.getString(3)); 
		//System.out.println(x+ " "+ " Record inserted");
		}
	}

}

