<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>ฟอร์มการเพิ่มข้อมูลสินค้าในคลัง</h1>

	<p></p>
	<form method="post" action="add-product">

		ชื่อสินค้า <input type=text name="name"><br>
		 จำนวนสินค้า <input type=text name="amount"> หน่วย <br> 
		 ชื่อห้องเก็บสินค้า<input type=text name="store"><br>

		<input type=submit value="บันทึก">

	</form>
</body>
</html>