import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		Statement stm=con.createStatement();
		String query="Create table demo(id int,name varchar(5));";
		int count=stm.executeUpdate(query);
		System.out.println(count+" Table created");

	}

}
