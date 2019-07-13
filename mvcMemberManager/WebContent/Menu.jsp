<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main menu</title>

</head>
<body>
	<% String id = (String)session.getAttribute("id"); %>

	<div>
		<span><%=id %>님 환영합니다.</span>
		<span><a href="Logout">로그아웃</a></span>
	</div>
	<div>
		<span><a href ="SelectMembers">모든 회원 정보 보기</a></span>
		<span><a href ="join.jsp">회원 정보 생성</a></span>
		<span><a href ="searchMember.jsp">회원 정보 검색</a></span>
		<span><a href ="GetLoginUserInfo">회원 정보 수정</a></span>	
		<span><a href ="removeConfirm.jsp">회원탈퇴</a></span>	
		
	</div>
	

	
	
	
</body>
</html>