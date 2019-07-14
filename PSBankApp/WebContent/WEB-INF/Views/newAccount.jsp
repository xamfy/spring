<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><spring:message code="lbl.title" /></title>
</head>
<body>
<h2>Create New Account</h2>
<form:form action="saveAccount" modelAttribute="account">
<table>
	<tr>
		<td><spring:message code="lbl.accountNo" /></td>
		<td><form:input path="accountNo" size="30" /></td>
	</tr>
	<tr>
		<td><spring:message code="lbl.accountHolderName" /></td>
		<td><form:input path="accountHolderName" size="30" /></td>
	</tr>
	<tr>
		<td><spring:message code="lbl.balance" /></td>
		<td><form:input path="balance" size="30" /></td>
	</tr>
	<tr>
		<td colspan="2" align="center">
		<input type="submit" value="Create Account" name="btnSubmit" />
	</tr>
</table>
</form:form>

</body>
</html>