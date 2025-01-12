<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Add New Customer</h1>
	
	
	<form action="add-customer" method="post">
		<p>
		<!--  	ID : <input type="text" name="id"><br>-->
		</p>
		<p>
			Name : <input type="text" name="name">
		</p>
		<p>
			Tel : <input type="text" name="tel">
		</p>
		<p>
			Username : <input type="text" name="username">
		</p>
		<p>
			Password : <input type="text" name="password">
		</p>
		<input type="submit" value="Add Customer"
			style="margin-left: auto; margin-right: auto">
	</form>

	<br>
	<a href=customer-management> Back To Menu</a>
</body>
</html>