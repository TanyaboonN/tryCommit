package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MySQLConnect;


@WebServlet("/edit-menu")
public class EditMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public EditMenuServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		String priceString = request.getParameter("price");
		int price = Integer.parseInt(priceString);
		String name = request.getParameter("name");

		
		try {
			Connection con = MySQLConnect.getConnection();
			String sql = "UPDATE drink set name=?, price=? WHERE id=?"; //?, ? สิ่งที่ตอนคลิกแล้ว มันส่งเลข id เข้ามา
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, price);
			ps.setInt(3, id);
			ps.executeUpdate();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<br><a href=drink-management> Back To Drink Management </a>");
			
		}catch (Exception e) {
			e.printStackTrace();

		}
	}

}
