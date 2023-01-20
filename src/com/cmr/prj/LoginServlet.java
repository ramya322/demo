package com.cmr.prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Step 1: read the input values from HTML page --- request object
		String userName=request.getParameter("user-name");
		String password = request.getParameter("passwd");
		
		if(userName.equals(password)) {
			            // should redirect to Success.html
						// Request Dispatcher is a predefined Interface in Servlets
						// used to Navigate from one page to another page.
						
						// In the below use case, if the user name and password are same
						// then it goes to success.html
						
						RequestDispatcher rd = request.getRequestDispatcher("success.html");
						rd.include(request, response);
		                }
		else {
			// Appending the below message to login page
						PrintWriter pw = response.getWriter();
						pw.println("<h1> Invalid User name or password </h1> ");
						
						
						// Navigating to login.html
						RequestDispatcher rd = request.getRequestDispatcher("login.html");
						rd.include(request, response);
		    }
			
	}

}
