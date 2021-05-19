<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c  uri = "http://java.sun.com/jsp/jstl/core" %>
        <%@ taglib prefix = "sql" c" uri = "http://java.sun.com/jsp/jstl/sql" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listing Organization using JSTL Sql tag</title>
</head>
<body>
<h1> Listing Organization using a JSTL sql tag</h1>
<sql:query var="rs" dataSource="jdbc/springdb">

SELECT * FROM organization 
</sql:query>

<c:forEach var="row" items="${rs.rows }">

Name : $ {row.name} <br/>
Year : $ {row.year} <br/>
Zip : $ {row.postal_code} <br/>
Emp Count : $ {row.employee_count} <br/>
Slogan : $ {row.slogan} <br/> </br>



</c:forEach>
</body>
</html>