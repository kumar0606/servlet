package Com.controller2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		String user=request.getParameter("username");
		String pw=request.getParameter("password");
		if(user.equals("kumar")&& pw.equals("0606")) {
			request.getRequestDispatcher("welcome").forward(request, response);
		}else {
			pr.print("<h1>your enterd invalid user name or passwoord enter valid password</h1>");
			request.getRequestDispatcher("login.html").forward(request, response);
		}
		pr.close();
	}

}
