package Com.servletconfig_and_context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class config
 */
public class config extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pr=response.getWriter();
		ServletConfig cfg=getServletConfig();
		String s=cfg.getInitParameter("StudentName");
		String s1=cfg.getInitParameter("StudentEmail");
	pr.println("<center> StudentName:" +s+ "</center><br>");
	pr.println("<center> StudentEmail:" +s1+ "</center><br>");
	pr.close();
	}

	

}
