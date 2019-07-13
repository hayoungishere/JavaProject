package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigServlet
 */
//@WebServlet("/ConfigServlet")
public class ConfigServlet extends HttpServlet {
	
	int sum1=0;
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		
		String charset = this.getInitParameter("charset");
		req.setCharacterEncoding(charset);
		
		PrintWriter out = resp.getWriter();
		out.print("ConfigServlet 입니다.");
		
		out.print("<hr>");
		
		int sum=0;
		for(int i =0; i < 10 ; i++) {
			sum+=i; //sum = sum+i
			sum1+=i; //sum1 = sum1+i
		}
		out.print("sum합계 값 : "+sum+"<br/>");
		out.print("sum1합계 값 : "+sum1);
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
