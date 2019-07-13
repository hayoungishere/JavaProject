<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login" method="get">
		<fieldset>
			<legend>login 화면(get)</legend>
			ID : <input type="text" name ="id" /><br/>
			PW : <input type="password" name ="pw"/><br/>
			<input type="submit" value="전송"/>
		</fieldset>
	</form>
	
	<form action="login" method="post">
		<fieldset>
			<legend>login 화면(post)</legend>
			ID : <input type="text" name ="id" /><br/>
			PW : <input type="password" name ="pw"/><br/>
			<input type="submit" value="전송"/>
		</fieldset>
	</form>
	
</body>
</html>