package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MySQLConnect;



@WebServlet("/add-menu")
public class AddMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddMenuServlet() {
        super();
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String drinkName = request.getParameter("name");
		String drinkPriceString = request.getParameter("price");
		int drinkPrice = Integer.parseInt(drinkPriceString);
		
		
		try {
			Connection con = MySQLConnect.getConnection();
			String sql = "INSERT into drink(name,price) values(?,?)"; //?, ? สิ่งที่user key มาในช่อง name
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,  drinkName);
			ps.setInt(2,  drinkPrice);
			ps.executeUpdate();
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<br><a href=drink-management> Back To Drink Management </a>");
		
			
			out.println("<htm><head><title>Drink Management</title></head></html>");
			out.println("<h2> Available Drinks</h2>");
			out.println("<table border = '1' > ");
			out.println("<tr><th> ID </th><th> Drink Name</th><th> Price </th><tr>");
					
					
					

		} catch (Exception e) {
			e.printStackTrace();

		}
//			response.sendRedirect("drink-management");
	}
	
	}


