import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter id you want to delete");
		String id=s.nextLine();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/movies", "root", "root");
		Statement statement=con.createStatement();
		//String query="select * from customer_master";
		//String query="insert into customer_master values"+"('CUS013','Doe','987123456','add3','2015-03-12',21)";
		String query="delete from customer_master where customer_id="+"'"+id+"'";
		int count=statement.executeUpdate(query);
		System.out.println(count+"Record (s) deleted");
		/*ResultSet rs=statement.executeQuery(query);
		while(rs.next())
		
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getInt(6));*/
			//rs.close();
			statement.close();
			con.close();
		

	}

}
