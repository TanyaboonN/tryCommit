<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ติดต่อเรา Tanyaboon Namwong</title>
<link rel="stylesheet" href="mycss.css">


<script type="text/javascript">
	function checkName() {
		<!--> namefield  จะเก็บค่าที่กรอกลองไปในช่อง id=name จาก form ที่ชื่อ contact <--> 
		var namefield = document.forms["contact"]["name"].value; 
		
		if(namefield == ""){
			alert("กรุณากรอกชื่อ - นามสกุล");
			return false;
		}
	}
</script>




</head>
<body>
	<div style="text-align: center">
		<a href="index.jsp"> หน้าหลัก </a> | <a href="flower.jsp">ช่อดอกไม้/แจกันดอกไม้</a>|
		<a href="order.jsp"> วิธีการสั่งซื้อ</a> | <a href="pay.jsp">
			การชำระเงิน</a> | <a href="contact.jsp"> ติดต่อเรา</a>
	</div>

	<p></p>
	<img class="imgalign" src="img/banner.png" alt="banner img">

	<p></p>
	<h1 class="txtalign">ติดต่อเรา</h1>
	<form name="contact">
		<table>
			<tr>
				<td>*ชื่อ - นามสกุล :</td>
				<td><input type="text" id="name"></td>

			</tr>
			<tr>
				<td>อีเมลล์ :</td>
				<td><input type="text" id="email"></td>

			</tr>
			<tr>
				<td>รายละเอียด :</td>
				<td><textarea id="detail"></textarea></td>

			</tr>
			<tr>
				<td colspan="2"><input type="button" value="ส่งข้อมูล"
					class="imgalign" onClick=checkName()></td>


			</tr>
		</table>
	</form>

	<p></p>

	<!-- Footer -->
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