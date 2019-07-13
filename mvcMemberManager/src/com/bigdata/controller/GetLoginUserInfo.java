package com.bigdata.controller;

import java.io.IOException;

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
 * Servlet implementation class GetLoginUserInfo
 */
//@WebServlet("/GetLoginUserInfo")
public class GetLoginUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetLoginUserInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());

		
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		
	
		
		Web_memberServiceImpl service = new Web_memberService();
		Web_memberVO res= service.selectWeb_member(id);
		
		
		String path="updateInfo.jsp";
		
		request.setAttribute("member", res);
		RequestDispatcher rd = request.getRequestDispatcher(path);
		rd.forward(request, response);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
