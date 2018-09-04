<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- <div class="header-container">
		<div class="site-name" style="color: Red; font-size: 50px">
			<b>CapStore</b>&nbsp; &nbsp; <img
				src="C:\Users\bsruthi\Desktop\capstore.png" width="125" height="125" />
		</div>
		<div class="header-bar" align="Right">
			<j:if test="${pageContext.request.userPrincipal.name != null}">
        Hello Japan  &nbsp;|&nbsp;
           <a href="${pageContext.request.contextPath}/logout">Logout</a>
				<br>
				<br>

				<a href="Home.jsp""${pageContext.request.contextPath}/home">Home
				</a> &nbsp;|&nbsp;
             <a href="Categories.jsp""${pageContext.request.contextPath}/categories">Categories
					 </a>&nbsp;|&nbsp;
             <a href="SortBy.jsp""${pageContext.request.contextPath}/sortBy">SortBy:
				</a>&nbsp;|&nbsp;
            <a href="${pageContext.request.contextPath}/contact">Contact
				</a>&nbsp;|&nbsp;
			<a href="DandP.jsp""${pageContext.request.contextPath}/discounts&promos">Discounts
					& Promos </a>

			</j:if>
		</div>
	</div>
<br>
<br> --%>

	<!-- <button class="mainBanner__link__content__shopNow">
	      SHOP NOW
	    </button> -->
	<a href="/getSortListLowToHigh""${pageContext.request.contextPath}/lowToHigh">Low
		to High </a> &nbsp;|&nbsp;
	<br>
	<br>
	<a href="/getSortListHighToLow""${pageContext.request.contextPath}/highToLow">High
		to Low </a>&nbsp;|&nbsp;
	<br>
	<br>
	<form action="/getSortListByRange" method="post">
		<table style="with: 50%">
			<tr>
				<td>Range:</td>
				<td><input type="text" name="min" style="font-size: 15px"></td>
				<td>to</td>
				<td><input type="text" name="max" style="font-size: 15px" /></td>
				<td><button type="submit">search</button></td>
			</tr>
		</table>
	</form>

	
	<a href="/getSortListByMostViewed" >Most Viewed</a>
	

</body>
</html>