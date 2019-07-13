<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<table border="1">
			<tr>
	<%
		for(int i=2; i<10 ; i++ ){
	%>
				<td><%=i %></td> <!--| 1 | 2 | 3 | 4 | 5 | 6 |.. -->
	<%
		}
	%>
			</tr>
		</table>		
</body>
</html>