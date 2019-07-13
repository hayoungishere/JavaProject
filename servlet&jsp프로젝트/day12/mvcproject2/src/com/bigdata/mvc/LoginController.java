package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginController
 */
//@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		

//		
		String id =(String) request.getParameter("id");
		String pwd =(String) request.getParameter("pwd");
		
		if(id.isEmpty()|| pwd.isEmpty() ){
			out.print("<div> 아이디 또는 비밀번호를 입력하세요</div>");
			out.print("<div> <a href='login.jsp'> 뒤로 </a></div>");
			return;
		}
		
		if(id.equals("khy") && pwd.equals("123")) {
			out.print("로그인이 성공적으로 완료되었습니다.<br>");
			
			//session 생성
			HttpSession session =request.getSession();
			session.setAttribute("id",id);
			
			out.print(session.getAttribute("id")+"님이 로그인 하셨습니다.");
			out.print("<div><a href='MenuController'>menu</a></div>");

			out.print("<div><a href='LogoutController'>로그아웃</a></div>");
			
			
		}else {
			out.print("<div> 아이디 또는 비밀번호가 틀렸습니다.</div>");
			out.print("<div> <a href='login.jsp'> 뒤로 </a></div>");
		}
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
