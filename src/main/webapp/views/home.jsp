<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="../css/home.css">
<title>E-Learning Site</title>
</head>

<body> 
  <%
  response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1
  response.setHeader("Pragma", "no-cache"); // HTTP 1.0
  response.setHeader("Expires", "0") ; // Proxies

     if (session.getAttribute("myemail") == null) {
		response.sendRedirect("../index.jsp");
	  }
  %>
	<header style="
    display: flex;
    justify-content: space-between;
">
		<h1>E-Learning Site</h1>
	   <h1><a href="logout" style="
    color: #fff;
    text-decoration: none;
">Logout</a></h1>	
	</header>

	<div class="container">
		<div class="course">
			<h2>Web Development Course</h2>
			<p>Learn HTML, CSS, and JavaScript to build websites.</p>
			<a href="webdev.jsp">Start Learning</a>
		</div>

		<div class="course">
			<h2>Data Science Course</h2>
			<p>Learn data analysis, machine learning, and more.</p>
            <a href="datascience.jsp">Start Learning</a>
		</div>

		<div class="course">
			<h2>Graphic Design Course</h2>
			<p>Learn the fundamentals of graphic design.</p>
			<a href="graphicsdesg.jsp">Start Learning</a>
		</div>
	</div>
</body>

</html>
