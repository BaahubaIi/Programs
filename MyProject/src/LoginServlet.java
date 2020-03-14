
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {
			int count=0;
			String id=request.getParameter("uname");
			String pwd=request.getParameter("pwd");
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tiger","root","root");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from login");
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<html><body>");
			while(rs.next()) {
				String t1=rs.getString(1);
				String t2=rs.getString(2);
				if(id.equals(t1)&& pwd.equals(t2)) {
					count=1;
					break;
				}
			}
			if(count==1) {
				out.println("Authorized User");
			}
			else
				out.println("Not an authorized user");
			}
			catch(Exception e) {
				System.out.println(e);
				
			}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
