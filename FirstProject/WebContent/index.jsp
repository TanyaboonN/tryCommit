<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lilly Florist = Tanyaboon Namwong</title>
 <link rel="stylesheet" href = "mycss.css">
</head>
<body>
	<div style="text-align: center">
		<a href="index.jsp"> หน้าหลัก </a> | <a href="flower.jsp">ช่อดอกไม้/แจกันดอกไม้</a>|
		<a href="order.jsp"> วิธีการสั่งซื้อ</a> | <a href="pay.jsp">
			การชำระเงิน</a> | <a href="contact.jsp"> ติดต่อเรา</a>
	</div>

	<p></p>
	<img class="imgalign" src="img/banner.png" alt="banner img">


	<!-- สร้าง zone รูปภาพ content 1 โดยใช้ table ในการจัด layout โดยมองเป็น 2 row, 3 col  -->
	<!--  <table style="margin-left: auto; margin-right: auto"> -->
	<table>
		<tr>
			<td><img src="img/rose.png" class="productimg"></td>
			<td><img src="img/orderstep.png" class="productimg"></td>
			<td><img src="img/payment.png" class="productimg"></td>
		</tr>

		<tr>
			<td class="txtalign"><a href="flower.jsp">ช่อดอกไม้/แจกันดอกไม้</a></td>
			<td class="txtalign"><a href="order.jsp"> วิธีการสั่งซื้อ</a></td>
			<td class="txtalign"><a href="pay.jsp"> การชำระเงิน</a></td>
		</tr>
	</table>

	<!--  ใช้แท้ค p เปล่าๆ ในการสร้างช่องระหว่างระหว่างบรรทัด -->
	<p></p>

	<div class="txtalign">
		<a href="index.jsp"> หน้าหลัก </a> | <a href="flower.jsp">ช่อดอกไม้/แจกันดอกไม้</a>|
		<a href="order.jsp"> วิธีการสั่งซื้อ</a> | <a href="pay.jsp">
			การชำระเงิน</a> | <a href="contact.jsp"> ติดต่อเรา</a>
	</div>

	<p></p>

	<!--  1 row, 4 col -->
	<!-- 	<table style="margin-left: auto; margin-right: auto">  -->
	<table>
		<tr>
			<td><img src="img/fb.png" class="socialimg"></td>
			<td><img src="img/ig.png" class="socialimg"></td>
			<td><img src="img/tiktok.png" class="socialimg"></td>
			<td><img src="img/line.png" class="socialimg"></td>
		</tr>
	</table>

	<p class="txtalign">
		99420 การโปรแกรมเว็บ มหาวิทยาลัยสุโขทัยธรรมาธิราช <br> 2025 All
		Rights Reserved
	</p>

</body>
</html>