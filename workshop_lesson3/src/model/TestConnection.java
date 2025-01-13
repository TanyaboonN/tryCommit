package model;

import java.sql.Statement;

import com.mysql.cj.MysqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestConnection {

	public static void main(String[] args) {
			try {
				String url = "jdbc:mysql://127.0.0.1:3306/drinkshop"; //�͹�餴��� jdbc (driver ��ǹ֧�ͧ db: ��觵�ͧinstall ������ѹ������ѡ��Ҥ������) �������� 127.0.0.1 port 3306 schema ���� drinkshop
				String user = "root";
				String password = "12345678";
				
//				Connection con = DriverManager.getConnection(url, user, password);
				Connection con = MySQLConnect.getConnection();
				
				System.out.println("Connection Successful !");
				
				Statement st = con.createStatement(); 
				String sql = "SELECT * from drink";  
				ResultSet rs = st.executeQuery(sql);//statement st ������� query ������͹䢷��������㹵���� sql �ҡ�����Ҩ�����Ѿ������ [(...,...,...),(...,...,...)] �ҡ����纼��Ѿ������ set ���㹵���� rs 
				
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
