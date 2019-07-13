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
		String name = request.getParameter("name");
		//out.print 와 <%= % > 출력하는 부분은 동일
		out.print(id+" / "+name);
		
	%>
	<%-- <%= id%> / <%=name %> --%>
</body>
</html>