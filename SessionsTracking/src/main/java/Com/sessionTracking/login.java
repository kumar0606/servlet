package Com.sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter pr=response.getWriter();
	  String s=request.getParameter("username");
	  String s1=request.getParameter("password");
	  if(s1.equals("ravi")) {
		  pr.println("<h1> your login successfully..!!!!</h1>");
		   HttpSession ses=request.getSession();
		   ses.setAttribute("username", s);
		  request.getRequestDispatcher("welcome").include(request, response);
		  
	  }
	  else {
		  pr.println("<h2>entered incoorect username or password enter valid username or password..!!!!</h2>");
		  request.getRequestDispatcher("login.html").include(request, response);
	  }
	}

}
