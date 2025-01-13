<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit The Drink</title>
</head>
<body>
	<!-- โค้ดที่อยู่ระว่าง <%%> คือจาวา -->
	<%
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		String url = "jdbc:mysql://127.0.0.1:3306/drinkshop";
		String user = "root";
		String password = "12345678";
		
		java.sql.Connection con = java.sql.DriverManager.getConnection(url, user, password);
		String sql = "SELECT * from drink WHERE id=?"; //?, ? สิ่งที่ตอนคลิกแล้ว มันส่งเลข id เข้ามา
		java.sql.PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		java.sql.ResultSet rs = ps.executeQuery();
		
		rs.next();
		String drinkName = rs.getString("name");
		int price = rs.getInt("price");
	%>


	<h1>Edit The Drink</h1>
<!-- การเขียน java ปนกันกับภาษา HTML ให้ใช้  %% ตัวแปรจาวา  --> 

	<form action="edit-menu" method="post">
		<p>
		 	ID : <input type="text" name="id" value="<%=id %>" readonly><br>
		</p>
		
		<p>
			Name : <input type="text" name="name" value="<%=drinkName %>">   
		</p>
		<p>
			Price : <input type="text" name="price" value="<%=price %>">
		</p>
		<input type="submit" value="Edit Drink"
			style="margin-left: auto; margin-right: auto">
	</form>

	<br>
	<a href=drink-management> Back To Menu</a>
</body>
</html>