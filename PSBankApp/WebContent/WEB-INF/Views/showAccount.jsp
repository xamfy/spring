<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>     
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PS Bank: Account Details</title>
</head>
<body>
<h2><spring:message code="lbl.title" /></h2>
<!-- 
<p>Account # : ${param.accountNo}</p>
<p>Account Holder Name : ${param.accountHolderName}</p>
<p>Balance : ${param.balance}</p>
 -->

<p><spring:message code="lbl.accountNo" />: ${account.accountNo}</p>
<p><spring:message code="lbl.accountHolderName" />: ${account.accountHolderName}</p>
<p><spring:message code="lbl.balance" />: ${account.balance}</p>

</body>
</html>