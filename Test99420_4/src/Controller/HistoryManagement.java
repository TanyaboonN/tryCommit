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

/**
 * Servlet implementation class HistoryManagement
 */
@WebServlet("/HistoryManagement")
public class HistoryManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HistoryManagement() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		try {
			Connection con = MySQLConnect.getConnection();

			Statement st = con.createStatement();
			String sql = "SELECT * from etransaction";
			ResultSet rs = st.executeQuery(sql);

			
			PrintWriter out = response.getWriter();
		
			
			out.println("<htm><head><title>แบบฟอร์มประวัติการใช้ไฟฟ้า</title></head></html>");
			out.println("<body> <form method=\"post\" action=\"PageTwoServlet\">\r\n" + 
					"\r\n" + 
					"		หมายเลขใบแจ้งหนี้  <input type=text name=\"id\"><br>\r\n" + 
					"		 วันที่จ่าย <input type=text name=\"date\"><br>\r\n" + 
					"		 จำนวนหน่วยที่ใช้ <input type=text name=\"electric\"> หน่วย <br> \r\n" + 
					"		\r\n" + 
					"\r\n" + 
					"		<input type=submit value=\"บันทึก\">\r\n" + 
					"		<input type=reset value=\"เคลียร์\">\r\n" + 
					"	</form>");
					
					
			out.println("</table>");
			out.println("</body></html>");

		} catch (Exception e) {
			e.printStackTrace();

		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
