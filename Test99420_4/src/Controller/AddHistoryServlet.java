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

/**
 * Servlet implementation class AddHistoryServlet
 */
@WebServlet("/AddHistoryServlet")
public class AddHistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AddHistoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			String id = request.getParameter("id");
		
			String date = request.getParameter("date");
			String electric = request.getParameter("electric");
			
			
			try {
				Connection con = MySQLConnect.getConnection();
				String sql = "INSERT into etransaction(date,electric) values(?,?)"; //?, ? สิ่งที่user key มาในช่อง name
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1,  date);
				ps.setString(2,  electric);
				ps.executeUpdate();
				
//				response.setContentType("text/html");
//				PrintWriter out = response.getWriter();
//				out.println("<br><a href=drink-management> Back To Drink Management </a>");
			
			
						
						
						

			} catch (Exception e) {
				e.printStackTrace();

			}
			response.sendRedirect("PageTwoServlet");

	}

}
