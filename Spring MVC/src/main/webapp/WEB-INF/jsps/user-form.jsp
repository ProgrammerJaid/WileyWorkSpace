<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>User Form.</title>
	<style>
	.error {color: red}
	</style>
</head>
<body>
	<form:form action="checkform" modelAttribute="user">
		
		Username:<form:input path="username" />
		<form:errors path="username" cssClass="error" />
		<br/><br/>
		
		Password:<form:input path="password" />
		<form:errors path="password" cssClass="error" />
		<br/><br/>

		<input type="submit" value="Submit" />

	</form:form>
</body>
</html>