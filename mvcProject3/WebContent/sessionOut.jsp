<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String id = request.getParameter("id");
		session.setAttribute("id", id);
	%>
	로그인 완료
	<a href="Menu.jsp">메뉴</a>
</body>
</html>