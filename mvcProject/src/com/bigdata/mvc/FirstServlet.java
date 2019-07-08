package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * Get 방식
		 * url을 호출했을 때 기본적으로 호출되는 함수
		 * 문자를 url에 적어서 가져온다.
		 * http://localhost:9090/mvcProject/First?id=id
		 * ? 뒤 부터는 resource 부분이다.
		 * [name1(key)=value1&name2=value2&...] 형태를 가진다.
		 */
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		pw.print("<html><head><title>firstServlet</title></head><body>request to Get<br> Get방식 호출됨</body></html>");
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * Post 방식
		 * form 태그를 통해 methd="post"를 적어 넘겨줌
		 * url 에 resource를 넣지 않음
		 * get방식보다 보안에 뛰어남.
		 */
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		pw.print("<html><head><title>firstServlet</title></head><body>doPost</body></html>");
	}

}
