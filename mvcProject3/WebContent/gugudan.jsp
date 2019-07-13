<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 
	for(int i = 1 ; i < 10; i++) {
		for(int k =2 ; k < 10; k++) {
			sysout(k+"x"+i+"="+k*i);
		}
	}
	2x1| 2 | 3x1| 3 | 4x1 | 4 | 5x1 | 5| .....
	2x2| 4 | ......
	 -->
	
		<table border="1">
	
		
	<% // <% 안에는 자바언어가 들어감
	for(int i = 1 ; i < 10; i++) {
	%>
		<tr>
	<%
		for(int k =2 ; k < 10; k++) {
	%>
			<!--  out.print(k)-->
			<td><%=k %> x <%=i %></td>
			<td><%=k*i %></td>
	<%		
		}
	%>
		</tr>
	<%
	}
	%>
	<!-- 
	for(int k =2 ; k < 10; k++) {
		k //에러
		System.out.println(k);
	}
	
	 -->
	
<!-- 
int i=0;
out.print("<br/>")
i = 10;
i++; 
 -->


<!-- 
	PrintWriter out = resp.getWirter();
	int i =0;
	for(int i =0; i<10 ; i ++){
		out.print("<br/>")
		i=10;
		out.print("<div></div>")
		i++;
	}
 -->
 
	
		</table>
</body>
</html>