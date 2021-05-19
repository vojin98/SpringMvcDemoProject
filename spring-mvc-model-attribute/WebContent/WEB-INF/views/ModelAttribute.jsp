<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <@ taglib prefix="form" uri = "http://www.springframework.org/tags//form">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
input[type=text]
{
padding: 10px;
margin: 10px;
font-size: 20px;

}


input[type=submit]

{

border:none;

background-color: #4CAF50;

color:white;

padding: 16px;

margin:16px;

cursor: pointer;

font-size:20px;



}

h1,h2

{

color:#08298A;

text-allign:center;


}
</head>
<body>

<div allign="left" >
<h1> ${testData1A} </h1>
<div allign="center" >
<b> Corporate office ${testdata3.city} ${testdata3.zipCode}
<hr/> 

${testData1B}   ${testData2B}


</hr>






</body>
</html>