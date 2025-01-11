<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 style="text-align : center">ร้านทะเลหวาน</h1>
	<a href="index.jsp"> หน้าหลัก  </a> |
	<a href="billform.jsp"> จ่ายค่าอาหาร  </a> |
	<a href="###.jsp"> ใบเสร็จค่าอาหาร   </a> |
	
	<hr>
	
	<h3>รายละเอียดค่าอาหาร</h3>
	
	<form method="post" action="processbillServlet">
		โต๊ะที่		<input type="text" name="tableNumber"><br>
		ชื่อลูกค้า	<input type="text" name="custName"><br>
		ค่าอาหาร	<input type="text" name="priceFood">  บาท<br>
		ค่าเครื่องดื่ม	<input type="text" name="priceDrink"> บาท<br>
		ค่าของหวาน	<input type="text" name="priceSweet">  บาท<br>
		
		<input type="submit" value="จ่าย">
		
		
	</form>
	<!-- พอกด submit มันจะส่งค่าไปที่ servlet =ชื่อ processbillServlet -->
	
	
	
</body>
</html>