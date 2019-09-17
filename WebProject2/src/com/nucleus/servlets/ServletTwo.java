package com.nucleus.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nucleus.calc.Calculation;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/Servlet2")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

    String email2;
    public void init()
    {
    	ServletContext servletContext=getServletContext();
		email2=servletContext.getInitParameter("email");
		
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		/*int no1=Integer.parseInt(request.getParameter("no1"));
		int no2=Integer.parseInt(request.getParameter("no2"));
		Calculation calculation=new Calculation();
		int sum=calculation.add(no1, no2);
		request.setAttribute("sum", sum);
		
		out.println("<font color=green>Sum is: "+sum+"</font><br>");
		out.println("OK");
		RequestDispatcher dispatcher=request.getRequestDispatcher("ServletOne");
		//dispatcher.forward(request, response);
		dispatcher.include(request, response);*/
		
		ServletContext servletContext=getServletContext();
		String email=servletContext.getInitParameter("email");
		out.println("Email ID: "+email);
		out.println("Email ID 2: "+email2);
		
		
	}

}
