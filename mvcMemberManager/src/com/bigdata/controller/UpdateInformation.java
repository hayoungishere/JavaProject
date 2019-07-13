package com.bigdata.controller;

import java.io.IOException;

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
 * Servlet implementation class UpdateInformation
 */
//@WebServlet("/UpdateInformation")
public class UpdateInformation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateInformation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("called doGet");
		
		response.setContentType("text/html; charset=UTF-8");  // 한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
		
		Web_memberVO upMember = new Web_memberVO();
		upMember.setId(request.getParameter("id"));
		upMember.setPwd(request.getParameter("pwd"));
		upMember.setName(request.getParameter("name"));
		upMember.setAddress(request.getParameter("address"));
		upMember.setPhone_number(request.getParameter("phone_number"));
		upMember.setAge(Integer.parseInt(request.getParameter("age")));
		upMember.setAdmin_yn(request.getParameter("admin"));
		
		Web_memberServiceImpl service = new Web_memberService();
		int res= service.update_Web_member(upMember);
		
		String path="";
		
		if(res==1) {
			//정보 수정 완료
			path="Menu.jsp";
		}
		else {
			path="login.jsp";
		}
		System.out.println(path);
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
