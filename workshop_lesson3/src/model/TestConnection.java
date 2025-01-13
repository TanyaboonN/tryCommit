package model;

import java.sql.Statement;

import com.mysql.cj.MysqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestConnection {

	public static void main(String[] args) {
			try {
				String url = "jdbc:mysql://127.0.0.1:3306/drinkshop"; //คอนเน้คด้วย jdbc (driver ตัวนึงของ db: ซึ่งต้องinstall ไม่งั้นมันไม่รู้จักว่าคืออะไร) ที่เครอื่ง 127.0.0.1 port 3306 schema ขิ่อ drinkshop
				String user = "root";
				String password = "12345678";
				
//				Connection con = DriverManager.getConnection(url, user, password);
				Connection con = MySQLConnect.getConnection();
				
				System.out.println("Connection Successful !");
				
				Statement st = con.createStatement(); 
				String sql = "SELECT * from drink";  
				ResultSet rs = st.executeQuery(sql);//statement st ไปสั่งให้ query ตามเงื่อนไขที่เก็บอยู่ในตัวแปร sql จากนั้นเราจะได้ผลลัพธ์มาเป็น [(...,...,...),(...,...,...)] จากนั้นเก็บผลลัพธ์ที่เป็น set ไว้ในตัวแปร rs 
				
				while (rs.next()) {
					System.out.println("Drink name : " + rs.getString("name"));
					System.out.println("Price : " + rs.getInt("price"));
					System.out.println("--------------------------------");
				}
				
			}   catch (Exception e) {
				e.printStackTrace();
			}
	}

}
