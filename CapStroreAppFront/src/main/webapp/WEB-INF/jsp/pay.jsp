<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payment</title>
</head>
<body>
Payment Method
<form action="/getTransactionalDetails"><br>
Enter OrderID:
<input type="text" name="orderId"><br>
<!-- Payment Mode
<select  name="paymentMethod" >
     <option value="Net banking">Net banking</option>
    <option value="Credit or debit">Credit or debit</option>
    <option value="Cash on Delivery">Cash on Delivery</option>
</select> -->

<input type="submit" value="Submit"><br>



</form>
</body>
</html>