package com.bigdata.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bigdata.service.Web_memberService;
import com.bigdata.service.Web_memberServiceImpl;
import com.bigdata.vo.Web_memberVO;

/**
 * Servlet implementation class LoginController
 */
//@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("called LoginServlet");
		HttpSession session = req.getSession();
		String id = req.getParameter("id");
		String pwd = req.getParameter("pwd");
		String msg="";
		String path="";
		
		if(id!=null && pwd!=null) {
			if(id.isEmpty() || pwd.isEmpty()) {
				msg = "아이디 또는 비밀번호를 입력해주세요.";
				path = "login.jsp";
			} else {				
				Web_memberServiceImpl service = new Web_memberService();
				Web_memberVO res= service.selectWeb_member(id);
				
				if(res == null) {
					msg="해당 id를 가진 회원이 존재하지 않습니다.";
					System.out.println("1");
					path="login.jsp";
				}else if(!pwd.equals(res.getPwd())) {
					System.out.println(res.getPwd()+ "input pwd : "+pwd );
					System.out.println("2");

					msg="비밀번호가 잘못되었습니다.";
					path="login.jsp";
				}else {
					System.out.println("3");

					path="Menu.jsp";
				}
			}
		}
		//setAttribute 를 이용해서 원하는 값을 저장해서 보낼수 있음
		//getAttribute 로 값을 받을수 있음
		
		session.setAttribute("id", id);
		req.setAttribute("msg", msg);
		RequestDispatcher rd = req.getRequestDispatcher(path);
		rd.forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
