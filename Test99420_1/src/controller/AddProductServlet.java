package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/add-product")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");  
		
		String name = request.getParameter("name");  //get ค่าที่ user กรอกมาโดยระบุด้วย name ของ input box นั้นในที่นี้ก็คือ text1 
		String amount = request.getParameter("amount");
		String store = request.getParameter("store");
		
		PrintWriter jack = response.getWriter(); //class PrintWriter คลาสที่มีฟังชั่นที่จะ  print หน้าเพจ html ออกมาเลยทันทีที่ user กดส่ง form
												 // โดยสร้าง obj ชื่อ jack จากคลาส PrinWriter แล้วเรียกใช้ function ที่อยู่ในคลาส PrintWriter
			
			jack.println(" <h1>รายละเอียดของสินค้าที่เพิ่ม</h1> " + "ชื่อสินค้า : "+ name + "<br/>" + "จำนวนสินค้า : " + amount + "<br/>" + "ชื่อห้องเก้บสินค้า : " + store + "<br/>"
					 );
	}

}
