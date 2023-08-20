<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="../css/verifyuser.css">
<title>Reset Password</title>
</head>
<body>
  
  
  <%!
     int id  ;
  %>

  <%
      if (session.getAttribute("myemail1") == null) {
		response.sendRedirect("../index.jsp");
	  }else{
	   id = (Integer) session.getAttribute("id") ;
	   response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
    	   response.setHeader("Pragma", "no-cache"); // HTTP 1.0
    	   response.setHeader("Expires", "0") ; // Proxies
	  }
  %>

    <div class="container">
        <h1>Reset Password</h1>

       
        <form action="reset?id=<%=id %>" method="post" >
            <div class="form-group">
                <label for="email">Enter New Password</label>
                <input type="password" id="email" name="newpass" required style="
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
" >
            </div>

            <div class="form-group">
                <label for="phone">Confirm New Password</label>
                <input type="password" id="phone" name="confirmpass" required style="
    width: 100%;
    padding: 10px;
    border: 1px solid #ccc;
    border-radius: 4px;
">
            </div>

            <button type="submit" class="btn">Verify</button>
        </form>
    </div>
</body>
</html>