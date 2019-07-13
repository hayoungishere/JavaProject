<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Session 연습</title>
</head>
<body>
<h1> 로그인 하기 </h1>

<form action="LoginController" method="post">


<fieldset>
		ID : <input type="text" name="id"/> <br>
		PW : <input type="password" name="pwd"/> <br>
		<input type="submit" value="로그인하기"/>
</fieldset>

	

</form>

<a href="MenuController">메뉴</a>


</body>
</html>