package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServelt
 */
//@WebServlet("/LoginServelt")
public class LoginServlet extends HttpServlet {
	public LoginServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");  // 한글 깨짐 방지
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		String id= request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		System.out.println("id is "+id+"  password is "+pwd);
		
		if("123".equals(pwd)) {
		out.print("<html><head><title>firstServlet</title></head><body>request to Get<br> Get방식 호출됨 <br> <div>");
		out.print(id+"님이 로그인 하셨습니다.</div></body></html>");
		}
		else{
		out.print("<html><head><title>firstServlet</title></head><body>request to Get<br> Get방식 호출됨 <br> <div>");
		out.print("비밀번호가 일치하지 않습니다.</div></body></html>");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");  // 한글 깨짐 방지
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("UTF-8");
		String id= request.getParameter("id2");
		String pwd = request.getParameter("pwd2");
		
		System.out.println("id is "+id+"  password is "+pwd);
		
		if("123".equals(pwd)) {
		out.print("<html><head><title>firstServlet</title></head><body>request to Post<br> Post방식 호출됨 <br> <div>");
		out.print(id+"님이 로그인 하셨습니다.</div></body></html>");
		}
		else{
		out.print("<html><head><title>firstServlet</title></head><body>request to Post<br> Post방식 호출됨 <br> <div>");
		out.print("비밀번호가 일치하지 않습니다.</div></body></html>");
		}
		
	}

}
