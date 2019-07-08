<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="Login" method="get">
		<fieldset>
		<legend> LOGIN 화면(get)	</legend>
			ID : <input type="text" name="id" placeholder="id를 입력해주세요"/>
			PW : <input type="password" name="pwd" placeholder="비밀번호를 입력해주세요"/>
			<input type="submit" value="submit"/>
		</fieldset>	
	
	</form>
	
	
	<form action="Login" method="post">
		<fieldset>
		<legend> LOGIN 화면(post)	</legend>
			ID : <input type="text" name="id2" placeholder="id를 입력해주세요"/>
			PW : <input type="password" name="pwd2" placeholder="비밀번호를 입력해주세요"/>
			<input type="submit" value="submit"/>
		</fieldset>	
	
	</form>
	
	<form action="join.html" method="get">
		<input type="submit" value="가입하러 가기"/>
	</form>
	
	
</body>
</html>