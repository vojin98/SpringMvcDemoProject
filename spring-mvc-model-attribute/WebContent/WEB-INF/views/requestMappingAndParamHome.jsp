<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RequestParam and RequestMaping</title>

<style>
input[type="text"]
{

padding: 10px;
margin: 10px;
font-size: 20px;
input [type=submit] {

border:none;

background-color: #4CAF50;
color:white;
padding:16px;
margin:16px;
cursor:pointer;
font-size:20px;



}

h2{

color: #08298A;
text-allign:center

}

}


</style>
</head>
<body>
<div allign="left">

<h2 allign="center">Welcome to RequestMapping and RequestParam</h2>
<hr/>
<form action="test1">

<h3>test 1: Testing Request Param without explicit attributes</h3>
<label id="organization-name">Organization name</label>
<input type="text" name="orgname" placeholder="Enter name of the Organization" size="40">
<input type="submit" value="Submit"/>

</form>
<br/><br>

<form action="test2">

<h3>test 2: Testing Request Param without "method" attributes</h3>
<label id="organization-name">Organization name</label>
<input type="text" name="orgname" placeholder="Enter name of the Organization" size="40">
<input type="submit" value="Submit"/>

</form>

<form action="test3">

<h3>test 3: Testing Request Param fallback </h3>
<label id="organization-name">Organization name</label>
<input type="submit" value="Submit"/>

</form>
	
	
	<form action="test4">

<h3>test 4: Testing @RequestParam 'defaultvalue'attribute</h3>


<label id="organization-name">Organization name</label>
<input type="text" name="orgname" placeholder="Enter name of the Organization" size="40">
<input type="submit" value="Submit"/>

<input type="submit" value="Submit"/>

</form>



	<form action="test4">

<h3>test 5: Testing @RequestParam without name or value'attributes </h3>


<label id="organization-name">Organization name</label>
<input type="text" name="orgname" placeholder="Enter name of the Organization" size="40">
<input type="submit" value="Submit"/>

<input type="submit" value="Submit"/>

</form>
</div>


</body>
</html>