<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
            <%@ taglib prefix = c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Location details</title>
<style>

input [type="text"]
{
padding:10px;
margin:10px;
font-size:20px;

}
input[type=submit]
{

border:none;
colour:white;
padding:16px;
background-color:#4CAF50;
margin:pointer;
font-size:20px;

}

h2
{
color:#08298A;
text-align: cemter;
}


</style>
</head>
<body>


<h2 style="color:#DF0101">
<c:out value="${greetings }"> </c:out>
</h2>

<h2>Submit location for a list of organization</h2>

<div style="text-align:center">


<form action ="ListOrgs">

<input type="text" name = "LocationName"> <br/>
<input type="submit" value="get Organization"> <br/>
</form>
</div>



</body>
</html>