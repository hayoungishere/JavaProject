package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id"); //문자열로 전송됨
		String pw = req.getParameter("pw");
//		int pw = Integer.parseInt(req.getParameter("pw"));
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		if("1234".equals(pw)) {
			out.print("<div>"+id+"님이 로그인 하였습니다.</div>");
		}else {
			out.print("<div>잘못된 패스워드 입니다.</div>");
		}
		out.print("</body>");
		out.print("</html>");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		req.setCharacterEncoding("UTF-8");
		String id = req.getParameter("id"); //문자열로 전송됨
		String pw = req.getParameter("pw");
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		if("1234".equals(pw)) {
			out.print("<div>"+id+"님이 로그인 하였습니다.</div>");
		}else {
			out.print("<div>잘못된 패스워드 입니다.</div>");
		}
		out.print("</body>");
		out.print("</html>");
	}

}
