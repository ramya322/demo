package com.cmr.prj;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertEmployeeV1
 */
@WebServlet("/insertemployee1")
public class InsertEmployeeV1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertEmployeeV1() {
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
		
		//create a object of pojo class and inject the values to the object using 
		//setter methods
		
		Employee e=new Employee();
		e.setEmpid(empid);
		e.setEname(ename);
		e.setEmpdesignation(empdesignation);
		
		//Save the employee object in request Attribute
		
		request.setAttribute("e",e);
		RequestDispatcher rd = request.getRequestDispatcher("displayEmployee.jsp");
		rd.include(request, response);
		
		
	}

}
