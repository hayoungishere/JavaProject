package com.bigdata.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bigdata.service.Web_memberService;
import com.bigdata.service.Web_memberServiceImpl;
import com.bigdata.vo.Web_memberVO;

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
		/*
		 * 새로운 회원을 등록한다.
		 */
		System.out.println("called doGet");
		
		response.setContentType("text/html; charset=UTF-8");  // 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		
		Web_memberVO newMember = new Web_memberVO();
		newMember.setId(request.getParameter("id"));
		newMember.setPwd(request.getParameter("pwd"));
		newMember.setName(request.getParameter("name"));
		newMember.setAddress(request.getParameter("address"));
		newMember.setPhone_number(request.getParameter("phone_number"));
		newMember.setAge(Integer.parseInt(request.getParameter("age")));
		newMember.setAdmin_yn(request.getParameter("admin"));
		
		Web_memberServiceImpl service = new Web_memberService();
		int res= service.regist_Web_member(newMember);
		
		String path="login.jsp";
	
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("called doPost");
		doGet(request, response);
	}

}
