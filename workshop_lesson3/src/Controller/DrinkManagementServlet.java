package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MySQLConnect;

@WebServlet("/drink-management")
public class DrinkManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DrinkManagementServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Connection con = MySQLConnect.getConnection();

			Statement st = con.createStatement();
			String sql = "SELECT * from drink";
			ResultSet rs = st.executeQuery(sql);

			
			PrintWriter out = response.getWriter();
		
			
			out.println("<htm><head><title>Drink Management</title></head></html>");
			out.println("<h2> Available Drinks</h2>");
			out.println("<a href = addmenuForm.jsp> Add New Drink</a>");
			out.println("<table border = '1' > ");
			out.println("<tr><th> ID </th><th> Drink Name</th><th> Price </th><tr>");
					
					
					while (rs.next()) {
						String name = rs.getString("name");
						int price = rs.getInt("price");
						int id = rs.getInt("id");
						out.println("<tr>");
						out.println("<td>" + id + "</td>");
						out.println("<td>" + name + "</td>");
						out.println("<td>" + price + "</td>");
						out.println("<td><a href=editmenuForm.jsp?id=" + id + ">Edit</a></td>");
						out.println("<td><a href=delete-menu?id=" + id + ">Delete</a></td>");
						out.println("</tr>");
					}
			out.println("</table>");
			out.println("<br><a href=index.jsp> Back To Home </a>");
			out.println("</body></html>");

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
