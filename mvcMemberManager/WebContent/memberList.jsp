<%@page import="com.bigdata.vo.Web_memberVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MemberList jsp</title>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/functions" prefix="fn" %></head>
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

		<c:forEach items="${wmlist}" var="wmvo">	
			<tr>
				<td>${wmvo.no}</td>
				<td>${wmvo.id}</td>
				<td>${wmvo.name}</td>
				<td>${wmvo.address}</td>
				<td>${wmvo.phone_number}</td>
				<td>${wmvo.age}</td>
				<td>${wmvo.join_dt}</td>
				<c:choose>
					<c:when test="${fn:toLowerCase(wmvo.admin_yn) eq 'y'}"> <td> 관리자 </td>	</c:when>
					<c:otherwise> <td>일반회원 </td> </c:otherwise>
				</c:choose>
			</tr>	
		</c:forEach>	
		</table>
		
</body>
</html>