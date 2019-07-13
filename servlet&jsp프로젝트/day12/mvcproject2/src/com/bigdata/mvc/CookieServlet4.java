package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/CookieServlet4")
public class CookieServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int cnt = 1; //방문횟수(처음 방문횟수 1회)
		String id = req.getParameter("id"); //화면에서 받아온 id 값 추출
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		//모든쿠키들을 배열에 옮겨서 출력하는 문장
		
		Cookie[] cookies = req.getCookies();
		for(int i=0 ;cookies!=null && i<cookies.length ; i++) {
			//해당하는 id값을 찾기 위해 쿠키의 name 값을 비교하여 id 검색
			if(cookies[i].getName().equals(id)) {
				out.print("<h1>");
				//cookies[i].getName() ==> id값 ,  cookies[i].getValue() ==> cnt 값
				out.print(cookies[i].getName()+"님의 방문횟수는 "+cookies[i].getValue()+"회 입니다.");
				out.print("</h1><br/>");
				out.print("<a href ='cookie_test.jsp'>돌아가기</a>");
				cnt = Integer.parseInt(cookies[i].getValue());
			}
		}
		//첫 방문 조건문
		if(cnt==1) {
			out.print("<h1>");
			out.print(id+"님의 방문횟수는 "+cnt+"회 입니다.");
			out.print("</h1><br/>");
			out.print("<a href ='cookie_test.jsp'>돌아가기</a>");
		}
		cnt++;//방문횟수 증가
		//쿠키 생성시 name=id , value = cnt
		Cookie cookie = new Cookie(id,String.valueOf(cnt));
		resp.addCookie(cookie);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
