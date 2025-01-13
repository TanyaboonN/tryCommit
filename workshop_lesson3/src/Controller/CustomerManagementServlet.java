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


@WebServlet("/customer-management")
public class CustomerManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CustomerManagementServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Connection con = MySQLConnect.getConnection();

			Statement st = con.createStatement();
			String sql = "SELECT * from customer";
			ResultSet rs = st.executeQuery(sql);

			
			PrintWriter out = response.getWriter();
			out.println("<htm><head><title>Customer Management</title></head></html>");
			out.println("<h2> Available Customer</h2>");
			out.println("<a href = addCustomerForm.jsp> Add New Customer</a>");
			out.println("<table border = '1' > ");
			out.println("<tr><th> ID </th><th> Name </th><th> Tel </th><th> Username </th><th> Password </th><tr>");
					
					
					while (rs.next()) {
					
						int id = rs.getInt("id");
						String name = rs.getString("name");
						String Tel = rs.getString("Tel");
						String username = rs.getString("username");
						String password = rs.getString("password");

						out.println("<tr>");
						out.println("<td>" + id + "</td>");
						out.println("<td>" + name + "</td>");
						out.println("<td>" + Tel + "</td>");
						out.println("<td>" + username + "</td>");
						out.println("<td>" + password + "</td>");
						out.println("</tr>");
					}
			out.println("</table>");
			out.println("<br><a href=index.jsp> Back To Home </a>");
			out.println("</body></html>");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	}

}
