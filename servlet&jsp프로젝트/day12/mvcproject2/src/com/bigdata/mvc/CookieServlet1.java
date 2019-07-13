package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/CookieServlet1")
public class CookieServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		//쿠키 객체 생성 id=guest
		Cookie c1 = new Cookie("id","guest");
		//쿠키 생성후 응답값에 넣어서 보내줌
		resp.addCookie(c1);
		
		//쿠키 객체 생성 pwd=1234
		Cookie c2 = new Cookie("pwd","1234");
		//c2 쿠키의 경우 30초의 시간후 소멸되는 쿠키를 생성
		c2.setMaxAge(30);
		resp.addCookie(c2);
		
		out.print("쿠키전송");
		out.close();
	}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
