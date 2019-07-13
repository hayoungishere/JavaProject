<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<head>

  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/2.2.7/semantic.min.css" integrity="sha256-wT6CFc7EKRuf7uyVfi+MQNHUzojuHN2pSw0YWFt2K5E=" crossorigin="anonymous" />
  
</head>
</head>
<body>
	<!--  request.setAttribute("key","value") -->
	<% 
	//String msg = (String)request.getAttribute("msg"); 
		//if(msg == null){
			//msg="";
		//}
	%>
<!-- 	
	<form action="Login" method="post">
		아이디 : <input type="text" name = "id"/><br/>
		비밀번호 : <input type="password" name="pwd"/><br/>
		<input type="submit" value="로그인"/>
	</form>	
	
	<input type="button" onclick="location.href='join.jsp'" value="회원가입하기"/>
	
-->
	<%//=msg %>
	
	
	
	<form action="Login" method="Post">
	
	<div class="ui raised very padded center aligned text container segment">
  <h1 class="ui header">Log in</h1>
  <br>
  <div class="field">
   <div class="ui left icon input">
  <i class="mail outline icon"></i>
    <input type="text" name="id" placeholder="Your Id" autofocus="true">
  </div></div><br>
    <div class="field">
  <div class="ui left icon input">
<i class="lock icon"></i>
    <input type="password" name="pwd" placeholder="Password">
  </div></div>
<br>


  <div class="actions">
    <button class=" ui large teal button" type="submit">Log in</button>
  </div>
  <br>
  <p>Don't have an account? <a href="join.jsp"> Sign up </a>
</div>

</form>

</body>


</html>




