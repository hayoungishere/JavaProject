<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="PageServlet" method="get">

	<input type="radio" name="site" value="naver"/> 네이버 <br>
	<input type="radio" name="site" value="daum"/> 다음  <br>
	<input type="radio" name="site" value="google"/> 구글  <br>
	<input type="radio" name="site" value="login"/> 로그인하기 <br>
	<input type="submit" value="이동하기">
</form>



</body>
</html>