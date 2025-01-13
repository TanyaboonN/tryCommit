
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// /friendformServlet สื่อถึง servlet นี้ ชื่ออะไร
@WebServlet("/friendformServlet")
public class friendformServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public friendformServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");  //27-28 โค้ดที่ช่วยให้แสดงผลลัพธ์ที่เป็นภาษาไทยได้
		
		String name = request.getParameter("text1");  //get ค่าที่ user กรอกมาโดยระบุด้วย name ของ input box นั้นในที่นี้ก็คือ text1 
		String surName = request.getParameter("text2");
		String address = request.getParameter("text3");
		String phone = request.getParameter("text4");
		
		PrintWriter jack = response.getWriter(); //class PrintWriter คลาสที่มีฟังชั่นที่จะ  print หน้าเพจ html ออกมาเลยทันทีที่ user กดส่ง form
												 // โดยสร้าง obj ชื่อ jack จากคลาส PrinWriter แล้วเรียกใช้ function ที่อยู่ในคลาส PrintWriter
			jack.println(" <h1>เราได้เพิ่มคุณ</h1> " + "ชื่อ : "+ name + "<br/>" + "นามสกุล : " + surName + "<br/>" + "ที่อยู่ : " + address + "<br/>"
					+ "เบอร์โทรศัพท์ : " + phone  + " เป็นเพื่อนแล้ว<br> "); 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");  
		
		String name = request.getParameter("text1");  //get ค่าที่ user กรอกมาโดยระบุด้วย name ของ input box นั้นในที่นี้ก็คือ text1 
		String surName = request.getParameter("text2");
		String address = request.getParameter("text3");
		String phone = request.getParameter("text4");
		
		PrintWriter jack = response.getWriter(); //class PrintWriter คลาสที่มีฟังชั่นที่จะ  print หน้าเพจ html ออกมาเลยทันทีที่ user กดส่ง form
												 // โดยสร้าง obj ชื่อ jack จากคลาส PrinWriter แล้วเรียกใช้ function ที่อยู่ในคลาส PrintWriter
			
			jack.println(" <h1>เราได้เพิ่มคุณ</h1> " + "ชื่อ : "+ name + "<br/>" + "นามสกุล : " + surName + "<br/>" + "ที่อยู่ : " + address + "<br/>"
					+ "เบอร์โทรศัพท์ : " + phone  + " เป็นเพื่อนแล้ว<br> "); 
	}

}
