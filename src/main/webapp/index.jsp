<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <link rel="stylesheet" type="text/css" href="css/index.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
</head>

<body>

  <%
       
 if(session.getAttribute("success") != null && (Boolean)session.getAttribute("success")==true){
  %> 
    <%@ include file = "views/toast.html" %>
  <%
    session.removeAttribute("success") ;
      }
  %>
  
  <%       
  session.removeAttribute("myemail");
  session.removeAttribute("myemail1");
  %>
     
    <div class="wrapper">
        <header>Login Form</header>
        <form action="login" method="post">
            <div class="field email">
                <div class="input-area">
                    <input type="email" placeholder="Email Address" name="email" required >
                    <i class="icon fas fa-envelope"></i>
                    <i class="error error-icon fas fa-exclamation-circle"></i>
                </div>
                <div class="error error-txt">Email can't be blank</div>
            </div>
            <div class="field password">
                <div class="input-area">
                    <input type="password" placeholder="Password" name="password" required>
                    <i class="icon fas fa-lock"></i>
                    <i class="error error-icon fas fa-exclamation-circle"></i>
                </div>
                <div class="error error-txt">Password can't be blank</div>
            </div>
            <div class="pass-txt"><a href="views/verifyuser.jsp"> FORGOT PASSWORD ? </a></div>
            <input type="submit" value="Login">
        </form>
        <div class="sign-txt">NOT YET MEMBER ? <a href="views/register.jsp">SIGNUP NOW</a></div>
    </div>
    
   
    
   
 
</body>

</html>