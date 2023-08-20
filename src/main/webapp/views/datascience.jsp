<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Data Science</title>
</head>
<body>
  <%

     if (session.getAttribute("myemail") == null) {
		response.sendRedirect("../index.jsp");
	  }
  %>
  <core:import url="https://www.javatpoint.com/java-tutorial"></core:import>
</body>
</html>
