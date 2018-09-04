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
			<th>productId</th>
			<th>productName</th>
			<th>price</th>
			<th>merchant</th>
			<th>quantity</th>
			<th>category</th>
			<th>promoCode</th>
			<th>discount</th>
			<th>imageId</th>
			<th>feedbackProduct</th>
		</tr>
		<c:forEach items="${product}" var="product">

			<tr>

				<td>${product.productId}</td>
				<td>${product.productName}</td>
				<td>${product.price}</td> 
				<td>${product.merchant}</td>
				<td>${product.quantity}</td>
				<td>${product.category}</td>
				<td>${product.promoCode}</td>
				<td>${product.discount}</td>
				<td>${product.imageId}</td>
				<td>${product.feedbackProduct}</td>
				<td>
			</tr>
		</c:forEach>
	</table>

	</br>
	<!-- <a href="#" name="Logout">Logout</a> -->
</body>
</html>

