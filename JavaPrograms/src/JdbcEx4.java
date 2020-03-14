import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx4 {
	public void Connection() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		System.out.println("Connection Established");
	}
	public void Create()
	{
		Statement stm=con.createStatement();
		String query="Create table demo(id int,name varchar(5));";
		int count=stm.executeUpdate(query);
	}
	public void Update()
	{
		
	}
	public void Delete()
	{
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
