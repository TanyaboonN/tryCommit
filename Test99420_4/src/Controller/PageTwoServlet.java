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
 * Servlet implementation class PageTwoServlet
 */
@WebServlet("/PageTwoServlet")
public class PageTwoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PageTwoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		
		try {
			Connection con = MySQLConnect.getConnection();

			Statement st = con.createStatement();
			String sql = "SELECT * from etransaction";
			ResultSet rs = st.executeQuery(sql);
		
		out.println("<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"UTF-8\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	ประวัติการใช้ไฟฟ้า\r\n" + 
				"	<a href=HistoryManagement>\r\n" + 
				"	[เพิ่มประวัติ]\r\n" + 
				"	</a>\r\n" + "<br/>" +
				"</body>\r\n" + 
				"</html>");
		

		while (rs.next()) {
			String date = request.getParameter("date");
			String electricString = request.getParameter("electric");
			int electric = Integer.parseInt(electricString);
			int id = rs.getInt("id");
			out.println("<tr>");
			out.println("<td>" + "ใบแจ้งหนี้หมายเลข "+   id + "||" + "</td>");
			out.println("<td>" + "จ่ายวันที่ "+   date + "||" + "</td>");
			out.println("<td>" + "จำนวนที่ใช้ "+   electric + "หน่วย  ||" + "</td>");
			out.println("<td>" + "ค่าไฟที่ต้องจ่าย "+   electric + "บาท ||" + "</td>");
			
			
			out.println("<td><a href=delete-menu?id=" + id + ">Delete</a></td>");
			out.println("</tr>");
		}
		
		}catch (Exception e) {
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
