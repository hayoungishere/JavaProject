package com.bigdata.mvc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * Get ���
		 * url�� ȣ������ �� �⺻������ ȣ��Ǵ� �Լ�
		 * ���ڸ� url�� ��� �����´�.
		 * http://localhost:9090/mvcProject/First?id=id
		 * ? �� ���ʹ� resource �κ��̴�.
		 * [name1(key)=value1&name2=value2&...] ���¸� ������.
		 */
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		pw.print("<html><head><title>firstServlet</title></head><body>request to Get<br> Get��� ȣ���</body></html>");
	}


	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		/*
		 * Post ���
		 * form �±׸� ���� methd="post"�� ���� �Ѱ���
		 * url �� resource�� ���� ����
		 * get��ĺ��� ���ȿ� �پ.
		 */
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter pw = resp.getWriter();
		pw.print("<html><head><title>firstServlet</title></head><body>doPost</body></html>");
	}

}
