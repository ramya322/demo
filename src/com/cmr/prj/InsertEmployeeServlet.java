package com.cmr.prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertEmployeeServlet
 */
@WebServlet("/insertemployee")
public class InsertEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Step 1: Read the data from HTML Page
		
		int empid = Integer.parseInt(request.getParameter("empid"));// reading an integer value from text box
		String ename = request.getParameter("ename"); //text box
		String empdesignation = request.getParameter("empdesignation");
		
		// Dispaly the above data in another Web Page
		// we have to generate the Web page dynamically in the servlet
		
		// What ever the values supplied by user is displaying in another Web Page
		
		
		// Procedure to generate the web page dynamically in servelt
		
		PrintWriter pw = response.getWriter();
		pw.println("<html>");
		
		pw.println("<head></head>");
		
		pw.println("<body>");
		
		pw.println("<table>");
		
		pw.println("<tr>");
		pw.println("<td> Employee Id </td>");
		pw.println("<td>" + empid +"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td> Employee Name </td>");
		pw.println("<td>" + ename +"</td>");
		pw.println("</tr>");
		
		pw.println("<tr>");
		pw.println("<td> Employee Designation </td>");
		pw.println("<td>" + empdesignation +"</td>");
		pw.println("</tr>");
		
		
		
		pw.println("</table>");
		
		pw.println("</body>");
		
		pw.println("</html>");
	}

}
