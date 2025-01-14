package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvestigateServlet
 */
@WebServlet("/investigate")
public class InvestigateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InvestigateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String sugarString = request.getParameter("sugar");  //get ค่าที่ user กรอกมาโดยระบุด้วย name ของ input box นั้นในที่นี้ก็คือ tableNumber
		int sugar = Integer.parseInt(sugarString);
		String getClientName = request.getParameter("name");
		
		
		PrintWriter jack = response.getWriter();
		jack.println("<h1>ผลการวินิจฉัย</h1>");

		if(sugar > 125) {
			 String result = "";
			jack.println("ชื่อผู้รับการตรวจ : "+ getClientName + "<br/>"
					+ "ระดับน้ำตาลในเลือด " + sugar + " มิลลิกรัม/เดซิลิตร" + "<br/>" 
					+ "ผลการวินิจฉัย : Diabetes : Consult a Doctor for a Treatment"	);		 
					 
		
			} else if(101 <= sugar && sugar <= 125 ) {
					;
					jack.println("ชื่อผู้รับการตรวจ : "+ getClientName + "<br/>"
							+ "ระดับน้ำตาลในเลือด " + sugar + " มิลลิกรัม/เดซิลิตร" + "<br/>" 
							+ "ผลการวินิจฉัย :  Risk of diabetes -> Modify eating behavior"			 
							
							); 
		}
			else if(70 <= sugar && sugar <= 100 ) {
				
				jack.println("ชื่อผู้รับการตรวจ : "+ getClientName + "<br/>"
						+ "ระดับน้ำตาลในเลือด " + sugar + " มิลลิกรัม/เดซิลิตร" + "<br/>" 
						+ "ผลการวินิจฉัย :  Normal"			 
						
						); 
			} 
			 else {
					jack.println("ชื่อผู้รับการตรวจ : "+ getClientName + "<br/>"
							+ "ระดับน้ำตาลในเลือด " + sugar + " มิลลิกรัม/เดซิลิตร" + "<br/>" 
							+ "ผลการวินิจฉัย :  Take 15 gram of Carbohydrate -> 1 banana"
				);
		
	}

}}
