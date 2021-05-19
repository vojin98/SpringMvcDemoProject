<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h2 allign="center" style="colour:#DF0101"> Welcome <c:out value="${greetings}"> </c:out> }</h2>
</hr>


<h1 allign="center"> Organization details</h1>
<c:set var = "contextPath" value="${pageContext.request.contextPath } }"/>
<div style="text-align:center">
<a href ="${contextPath}/location" style="font-size: 30px]"> Click for organization details. </a>
</div>




</body>
</html>