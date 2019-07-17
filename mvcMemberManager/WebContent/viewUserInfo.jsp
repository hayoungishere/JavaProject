<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.bigdata.vo.Web_memberVO"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색결과</title>

<link rel="stylesheet" type="text/css" href="css/join.css"/>
<script type="text/javascript" src="script2.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>

</head>
<body>

<%
	Web_memberVO member = (Web_memberVO)request.getAttribute("member");
	if(member==null){
		%>
		조회결과가 존재하지 않습니다.
		<%
	}else{
%>

  <div class="container" id="container">		
            <div class="signup" id="signup-container">
                <div class="signup__heading">
                    <h1 class="signup__heading-text">Searching Account</h1>
                </div>
            
                <form action="UpdateInformation" id="UpdateInformation" method="POST" class="signup-form validate">
                
                    <label class="signup-form__icon-box">
                   	 You can't update your id.
                        <input type="text" id="userid" name="id" value=${wmvo.id} autocomplete="id" class="signup-form__input user signup-form__input--active"  minlength="3" maxlength="12" pattern="[A-Za-z0-9]+" title="Your Password must include only numbers and letters."  readonly>
                    </label>
                                    
                   <label class="signup-form__icon-box">
                   		<input type="password" name="pwd" value="<%=member.getPwd()%>" placeholder="Password" class="signup-form__input emial2" readonly/>
                   </label>
                          <label class="signup-form__icon-box">
                        <input type="text" id="username" name="name" value="<%=member.getName()%>" placeholder="Username" autocomplete="username" class="signup-form__input user signup-form__input--active"  minlength="3" maxlength="12" pattern="[A-Za-z0-9]+" title="Your Password must include only numbers and letters."  readonly>
                        
                    </label>
                                    
                    <label class="signup-form__icon-box">
                        <input type="text" id="address" name="address" value="<%=member.getAddress()%>"placeholder="Address" class="signup-form__input email2" readonly>
                    </label>
                      
                     <label class="signup-form__icon-box">
                        <input type="text" id="phoneNumber" name="phone_number"  value="<%=member.getPhone_number()%>"placeholder="Phone Number" class="signup-form__input email2" readonly>
                    </label>
                    
                       <label class="signup-form__icon-box">
                        <input type="text" id="age" name="age" placeholder="Age"  value="<%=member.getAge()%>"class="signup-form__input email2" readonly>
                    </label>
 					<input type="hidden" name="admin" value="N"/>
 
       
        <br>

               

                <button type="submit" id="registerButton" class="registerButton" name="registerButton">Update</button>
            <br>
            </form>
            </div>      
        </div>
        <%} %>
</body>
</html>