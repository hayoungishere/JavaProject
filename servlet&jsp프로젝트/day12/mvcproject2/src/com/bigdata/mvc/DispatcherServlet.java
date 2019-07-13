package com.bigdata.mvc;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DispatcherServlet
 */
//@WebServlet("/DispatcherServlet")
public class DispatcherServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DispatcherServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String id=request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id != null && pwd != null) {
			if(id.isEmpty() || pwd.isEmpty()) {
				response.sendRedirect("login1.jsp");
				return;
			}
			
			if(id.equals("omin318") && pwd.equals("1234")) {
				//ServletContext sc = this.getServletContext();
				//RequestDispatcher rd = sc.getRequestDispatcher("/DispatcherServlet2");
				RequestDispatcher rd = request.getRequestDispatcher("DispatcherServlet2");
				
				rd.forward(request, response);
			}else {
				response.sendRedirect("login2.jsp");
			}
		}
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
