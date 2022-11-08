package Com.servletconfig_and_context;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class context extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     response.setContentType("text/html");
		     PrintWriter pr=response.getWriter();
		     ServletConfig cfg=getServletConfig();
		     ServletContext cnt=getServletContext();
		     String s=cnt.getInitParameter("StudentName");
		     String s1=cnt.getInitParameter("StudentEmail");
		     pr.println("<center> StudentName:"+s+"</cenetr><br>");
		     pr.println("<center> StudentEmail:"+s1+"</cenetr><br>");
		     System.out.println("StudentName:"+s);
		     System.out.println("StudentEmail:"+s1);
		     pr.close();
	}

	
}
