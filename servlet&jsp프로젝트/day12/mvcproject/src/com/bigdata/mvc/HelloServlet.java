package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */

//@WebServlet("/Hello")
//servlet 구현방법 2가지 => @WebServlet 어노테이션 사용
//                                => web.xml에 servlet 등록하는 방법(선호)

public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init 메소드 실행");
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service 메소드 실행");
		PrintWriter pw = response.getWriter();
		pw.print("<html>");
		pw.print("<head>");
		pw.print("<title>helloServlet</title>");
		pw.print("</head>");
		pw.print("<body>");
		pw.print("<p>helloServlet</p>");
		pw.print("</body>");
		pw.print("</html>");
	}
	
	
}
