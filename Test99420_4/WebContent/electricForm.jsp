<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> แบบฟอร์มประวัติการใช้ไฟฟ้า
	</h1>
	
	<form method="post" action="add-history">

		หมายเลขใบแจ้งหนี้  <input type=text name="id"><br>
		 วันที่จ่าย <input type=text name="date"><br>
		 จำนวนหน่วยที่ใช้ <input type=text name="electric"> หน่วย <br> 
		

		<input type=submit value="บันทึก">
		<input type=reset value="เคลียร์">
	</form>
	
	
</body>
</html>