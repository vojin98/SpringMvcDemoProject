<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = c" uri = "http://java.sun.com/jsp/jstl/core" %>
                <%@ taglib prefix = "sql" c" uri = "http://java.sun.com/jsp/jstl/sql" %>
        
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List organization using Service</title>

<style>

table
{

border-collapse;
}


table th,td;

{
padding: 5px;
margin  : 10px;
font - size  :20px;
border : 1px solid black;

}

</style>
</head>
<body>

<h2 allign = "center" style="color: @DF0101">
<c:out value = "${greeting }"> </c:out>


</h2>

<div allign="center">

<table>
<caption style="font-size :40px; margin-bottom:10px]">
<c:out value="${locationName }"/> Organization directory 
</caption>
<tr>
<th>  Name </th>
<th>  Year</th>
<th>  Zip</th>
<th>  Emp</th>
<th>  Slogan</th>
</tr>

<c:forEach var =" row" items= "${orgList }">


<tr>
      <td>    <c:out value="${row.companyName }"/> </td>
      <td>    <c:out value="${row.year }"/> </td>
      <td>    <c:out value="${row.postalCode }"/> </td>
      <td>    <c:out value="${row.employeeCount }"/> </td>
      <td>    <c:out value="${row.slogan }"/> </td>htl
      
   
</tr>


</c:forEach>

</table>
</div>

<h1>listing organizations with service</h1>


</body>
</html>