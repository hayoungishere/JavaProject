<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	forward 페이지 출력
	<%
		RequestDispatcher rd = request.getRequestDispatcher("requestOut.jsp");
		rd.forward(request, response);
	%>
</body>
</html>