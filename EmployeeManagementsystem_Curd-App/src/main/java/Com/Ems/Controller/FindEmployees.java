package Com.Ems.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Com.Ems.Model.Employe;
import Com.Ems.Service.EmployeServiceimpl;


public class FindEmployees extends HttpServlet {
	private static final long serialVersionUID = 1L;
 private EmployeServiceimpl service=new EmployeServiceimpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Employe> employes=service.getAll();
		PrintWriter pr=response.getWriter();
		pr.print("<table border='1 px'>");
		pr.print("<tr><th>Ename</th><th>Eid</th><th>Esalary</th><th>Email</th>");
	for(Employe employe: employes) {
		pr.print("<tr>");
		pr.print("<td>"+employe.getId()+"</td>");
		pr.print("<td>"+employe.getName()+"</td>");
		pr.print("<td>"+employe.getSalary()+"</td>");
		pr.print("<td>"+employe.getEmail()+"</td>");
		pr.print("</tr>");
	}
	pr.print("</table>");
	pr.print("<a href='index.jsp'>clickhere</a>");
		
			}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
