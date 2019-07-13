package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/SContextServlet")
public class SContextServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//ServletContext 객체 생성
		ServletContext sc = this.getServletContext();
		//getInitParameter 함수를 통한 web.xml parameter 값 가져오기
		String contextName = sc.getInitParameter("contextName");
		//응답값 타입 정의 (한글 타입)
		resp.setContentType("text/html; charset=UTF-8");
		//응답값으로 사용자에게 화면을 보여주기 위한 PrintWriter 객체 생성 
		PrintWriter out = resp.getWriter();
		//PrintWriter 를 이용한 화면 출력
		out.print("<h1>"+contextName+"</h1>");
		//ServletContext 객체를 이용한 값 공유 
		//어플리케이션 단위이기 때문에 서버를 종료하지 않으면 계속
		//값을 공유
		sc.setAttribute("shareData","공유값 입니다.");
		
		//PrintWriter 통로 닫아주기
		out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
