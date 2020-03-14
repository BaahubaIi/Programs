

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
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
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("name");
		String s2=request.getParameter("password");
		if(s2.equals("venkat1109"))
		{
			pw.println("You have successfully logged in");
			pw.println("<br>Welcome,"+s1);
			Cookie ck=new Cookie("name",s1);
			response.addCookie(ck);
		}
		else
		{
			pw.println("Login Failed, Try Again");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		pw.close();
	}

}
