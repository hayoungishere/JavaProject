<%@page import="com.bigdata.vo.Web_memberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberList jsp</title>

</head>
<body>

<div><h2>회원 전체 정보</h2></div>
		<table border="1">
			<tr>
				<th>번호 </th>
				<th>아이디 </th>
				<th>이름 </th>
				<th>주소 </th>
				<th>핸드폰 번호 </th>
				<th>나이</th>
				<th>가입일자</th>
				<th>관리자여부</th>
			</tr>

		
	<% 
		List<Web_memberVO> wmlist = (List<Web_memberVO>)request.getAttribute("wmlist");	
		for(Web_memberVO vo : wmlist){
			%>
		<tr>
			<td><%=vo.getNo()%></td>
			<td><%=vo.getId()%></td>
			<td><%=vo.getName()%></td>
			<td><%=vo.getAddress()%></td>
			<td><%=vo.getPhone_number()%></td>
			<td><%=vo.getAge()%></td>
			<td><%=vo.getJoin_dt()%></td>
			
			<%if( vo.getAdmin_yn().equalsIgnoreCase("y")){ %> 
				<td>관리자</td>
			<% }else { %>
				<td>일반회원</td>
			<%} %>
			
		</tr>
			<% 
		}
	%>	
		</table>
		
</body>
</html>