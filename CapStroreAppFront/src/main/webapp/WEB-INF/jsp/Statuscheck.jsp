<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1" style="width: 100%">
		<tr>
			<th>OrderId</th>
			<th>orderStatus</th>
			<th>quantity</th>
			<th>Payment Method</th>
			<th>deliveryDate</th>
			<th>MinBillingAmount</th>
			
		</tr>
		
			<tr>
				<td>${customer.orderId}</td>
				<td>${customer.orderStatus}</td>
				<td>${customer.quantity}</td>
				<td>${customer.paymentMethod}</td>
				<td>${customer.deliveryDate}</td>
				<td>${customer.minBillingAmount}</td>
		
	</table>
	<a href="status" name="Back">Back to status Page</a></br>
	<!-- <a href="#" name="Logout">Logout</a> -->
</body>
</html>