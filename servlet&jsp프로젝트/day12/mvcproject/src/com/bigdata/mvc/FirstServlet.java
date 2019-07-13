package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//GET 방식 
		//url을 호출했을때 기본적으로 호출되는 함수
		//문자를 url에 적어서 가져옮
		//http://localhost:9090/mvcproject/First?id=value&pw=value
		//  ? 뒤에부터는 resource 부분 
		// resource ==>  name값(key값) = value값
		// 값이 여러개일때는 &를 통해 값을 가져옮
		resp.setContentType("text/html; charset=UTF-8;");
		PrintWriter pw = resp.getWriter();
		pw.print("<html>");
		pw.print("<head>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<h1>GET 방식입니다.</h1>");
		pw.print("</body>");
		pw.print("</html>");
		pw.close();
		
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//POST 방식
		//form태그를 통해 method='post' 를 적어 넘겨줌
		//url에 resource를 넣지 않음
		resp.setContentType("text/html; charset=UTF-8"); 
		PrintWriter pw = resp.getWriter();
		pw.print("<html>");
		pw.print("<head>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<h1>POST 방식입니다.</h1>");
		pw.print("</body>");
		pw.print("</html>");
		pw.close();
	}

}
