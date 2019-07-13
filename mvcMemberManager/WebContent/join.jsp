<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<link rel="stylesheet" type="text/css" href="css/join.css"/>
<script type="text/javascript" src="script2.js"></script>

</head>
<body>

  <div class="container" id="container">		
            <div class="signup" id="signup-container">
                <div class="signup__heading">
                    <h1 class="signup__heading-text">Create Account</h1>
                    <span class="signup__heading-steps">Step 1 of 3</span>
                </div>
            
                <form action="Join" id="registerForm" method="POST" class="signup-form validate">
                
                    <label class="signup-form__icon-box">
                        <input type="text" id="userid" name="id" placeholder="Id" autocomplete="id" class="signup-form__input user signup-form__input--active"  minlength="3" maxlength="12" pattern="[A-Za-z0-9]+" title="Your Password must include only numbers and letters."  required>
                    </label>
                                    
                   <label class="signup-form__icon-box">
                   		<input type="password" name="pwd" placeholder="Password" class="signup-form__input emial2"/>
                   </label>
                          <label class="signup-form__icon-box">
                        <input type="text" id="username" name="name" placeholder="Username" autocomplete="username" class="signup-form__input user signup-form__input--active"  minlength="3" maxlength="12" pattern="[A-Za-z0-9]+" title="Your Password must include only numbers and letters."  required>
                    </label>
                                    
                    <label class="signup-form__icon-box">
                        <input type="text" id="address" name="address" placeholder="Address" class="signup-form__input email2" required>
                    </label>
                      
                     <label class="signup-form__icon-box">
                        <input type="text" id="phoneNumber" name="phone_number" placeholder="Phone Number" class="signup-form__input email2" required>
                    </label>
                    
                       <label class="signup-form__icon-box">
                        <input type="text" id="age" name="age" placeholder="Age" class="signup-form__input email2" required>
                    </label>
 					<input type="hidden" name="admin" value="N"/>
 
       
        <br>

               

                <button type="submit" id="registerButton" class="registerButton" name="registerButton">SIGN UP</button>
               
                <div class="hasAccountText">
                    <a href="login.jsp">
                        <span class="hideRegister">
                        Already have an Account? <span class="text">Login here.</span>
                        </span>
                    </a>
                </div>
            <br>
            </form>
            </div>      
        </div>
    </body>




</html>