<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
//선언부

int sum(int a, int b){
	return a+b;
	}
int x=0;
%>


<%
// 자바 코드 작성
	for(int i=0; i<10; i++){ %>
	
	<div>
	<input type="button" value="버튼"> <%=i %></div>
	</div>
<%
	}
%>

<h1><%=sum(10,16) %></h1>

</body>
</html>