package Com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginpage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String user=request.getParameter("userName");
		String pw=request.getParameter("password");
		if(user.equals("ravi")&& pw.equals("1999")) {
		request.getRequestDispatcher("welcome").include(request, response);
		}else {
			writer.print("<h5> username or pw incorrect, please login again</h5>");
			request.getRequestDispatcher("login.html").include(request, response);
		}
		
		writer.close();
		
	}

//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		doPost(req, resp);
//	}
	
}
