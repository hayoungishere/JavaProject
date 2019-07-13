package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SContextServlet2
 */
//@WebServlet("/SContextServlet2")
public class SContextServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req	, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext sc = this.getServletContext();
		String contextName = sc.getInitParameter("contextName");
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>"+contextName+"</h1>");
		
		//ServletContext 객체를 이용한 값공유
		//SContextServlet에서 setAttribute으로 넣어준 값을  
		//다른 Servlet에서 getAttribute을 통해 꺼내 쓸수 있음.
		String shareData = (String)sc.getAttribute("shareData");
		
		out.print("<br><h2>"+shareData+"</h2>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
