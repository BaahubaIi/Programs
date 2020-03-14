package Controllers;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.EmployeeDao;
import Data.Emp;

/**
 * Servlet implementation class AddEmpServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		EmployeeDao empdao=new EmployeeDao();
		Emp emp=new Emp();
		int empid=Integer.parseInt(request.getParameter("ename"));
		String ename=request.getParameter("ename");
		String dept=request.getParameter("dept");
		String desg=request.getParameter("desg");
		String email=request.getParameter("email");
		emp.setDept(dept);
		emp.setDesg(desg);
		emp.setEmail(email);
		emp.setEmpid(empid);
		emp.setEname(ename);
		int flag=empdao.insertEmployee(emp);

		if(flag==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");
			rd.forward(request, response);

		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("failure.jsp");
			rd.forward(request, response);
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