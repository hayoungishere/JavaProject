package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/CookieServlet3")
public class CookieServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int count=0;
		//사용자로 부터 쿠키값을 받아와서 리스트 값으로 반환
		//쿠키는 하나의 값만 받아올수 없음
		Cookie[] cookies = req.getCookies();
		//배열 값으로 받아온 쿠키값 검색 (for문 이용)
		for(int i =0; i < cookies.length ; i++) {
			//쿠키의 name 값이 count 일때 조건문 true
			if(cookies[i].getName().equals("count")) {
				//쿠키의 value 값을 count에 입력
				count = Integer.parseInt(cookies[i].getValue());
			}
		}
		//방문횟수 증가
		count++;
		//count(방문횟수) 값 넣어서 쿠키 생성
		Cookie c1 = new Cookie("count", String.valueOf(count));
		//응답값에 쿠키값 넣어줌
		resp.addCookie(c1);
		
		
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("방문 횟수"+count);
		out.close();
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
