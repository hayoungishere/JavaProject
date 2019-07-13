<%@ page 
	language="java" 
	contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
    
<!DOCTYPE html>
<%@ page  import="java.util.*"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!//변수 및 함수 선언 가능
	int x=0;
	
	int sum(int a , int b){
		return a+b;
	}
	
	%> 
	<% //자바소스 작성 가능
		for(int i =0 ; i <= 10 ; i++){
	//<html> 자바 소스 (<%..)안에는 html 문 사용안됨
	%>
	<div><input type="button" value="버튼<%= i /*결과값*/%>"/></div>
	<% 		
		}
	%>
	
	<h1><%--<%=sum(10,15) %>--%></h1>
	<form action="jspServlet.jsp">
	</form>
	
</body>
</html>