<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transaction Details</title>
</head>
<body>
 
	<form action="transactionAmount">
 		Transaction Amount: <input type="text" name="transAmt">
 		<input type="submit" value="send">
 	</form>
 	<br><br><br>
 	<table border="1">
 		<tr>
 			<th>Transaction Id</th>
 			<th>Transaction amout</th>
 			<th>Balance</th>
 		</tr>
 		<tbody>
 			<c:forEach var="tran" items="${tran}">
				<tr>
					<td><c:out value="${tran.transId}" /></td>
					<td><c:out value="${tran.transAmt}" /></td>
					<td><c:out value="${tran.totalbalance}" /></td>
				</tr>
				</c:forEach>
 		</tbody>
 	</table>
</body>
</html>