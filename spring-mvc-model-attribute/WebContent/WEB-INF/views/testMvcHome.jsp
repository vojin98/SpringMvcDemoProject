<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
                    <%@ taglib prefix = "sql" c" uri = "http://java.sun.com/jsp/jstl/sql" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> TEST MVC HOME</title>
<style>

h2
{
color: #08298A;
text-allign :center 


}
</style>
</head>
<body>

<h2>MVC TEST HOME</h2>
<c:set var="contextPath" value = "${pageContext.request.contextPath}"/>
<div style = "text-allign-center">
 
<a href = "${contextPath }/ requestMappingAndParam/home"   style="font-size : 20px"> Click for Testing RequestParam and RequestMaping></a><br/>
</div>




</body>
</html>