package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JoinServlet
 */
//@WebServlet("/JoinServlet")
public class JoinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JoinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		response.setContentType("text/html; charset=UTF-8");  // ÇÑ±Û ±úÁü ¹æÁö
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		String id= request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println("id is "+id+"  password is "+pwd);
		
		out.print("<html><head><title>firstServlet</title></head><body>request to get<br> get¹æ½Ä È£ÃâµÊ <br> <div>");
		out.print(id+"´Ô È¯¿µÇÕ´Ï´Ù.</div></body></html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html; charset=UTF-8");  // ÇÑ±Û ±úÁü ¹æÁö
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		String id= request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println("id is "+id+"  password is "+pwd);
		
		out.print("<html><head><title>firstServlet</title></head><body>request to post<br> post¹æ½Ä È£ÃâµÊ <br> <div>");
		out.print(id+"´Ô È¯¿µÇÕ´Ï´Ù.</div></body></html>");
	}

}
