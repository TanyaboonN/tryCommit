<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Add New Drink</h1>
	
	
	<form action="add-menu" method="post">
		<p>
		<!--  	ID : <input type="text" name="id"><br>-->
		</p>
		<p>
			Name : <input type="text" name="name">
		</p>
		<p>
			Price : <input type="text" name="price">
		</p>
		<input type="submit" value="Add Drink"
			style="margin-left: auto; margin-right: auto">
	</form>

	<br>
	<a href=drink-management> Back To Menu</a>
</body>
</html>