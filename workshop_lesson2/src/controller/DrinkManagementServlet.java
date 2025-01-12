package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Drink;

@WebServlet("/drink-management")
public class DrinkManagementServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<Drink> menuList;

	@Override
	public void init() throws ServletException { // การเพิ่มข้อมูลเข้าไปใน list ที่มีหน้าจาแบบ Drink โดยเก้บในตัวแปร
													// menuList ด้วยการ manual เพิ่มมือ
		List<Drink> menuList = new ArrayList<>();
		menuList.add(new Drink(1, "Americano", 30));
		menuList.add(new Drink(2, "Cappucino", 40));
		menuList.add(new Drink(3, "Espresso", 50));
		menuList.add(new Drink(4, "Latte", 45));
		ServletContext context = getServletContext(); // servletcontext คือการทำให้ตัวแปรๆนึง สามารถใช้ได้ทุกที่ทุกเมื่อ
		context.setAttribute("menuList", menuList); // set ให้ menuList ใช้ได้ทุกที่ทุกเมื่อ
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		ServletContext context = getServletContext();

		List<Drink> menuList = (List<Drink>) context.getAttribute("menuList");
		response.setContentType("text/html1");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html><head><title> Drink Management</title></head>");
		out.println("<body>");
		out.println("<h1> Current Menu</h1>");

		out.println("<a href=addmenuForm.jsp> Add Menu </a>");
		out.println("<table border='1'>"); // setให้ ตารางมีขอบ หนา 1 px
		out.println("<tr><th>ID</th><th> Menu </th><th> Price </th> </tr>"); // tr - table row, th - table header
																				// ชื่อหัวตาราง แสดงเป็นตัวหนา

		for (Drink drink : menuList) { // loop ในก่ารสั่งปริ่นข้อมูลใน menuList จนหมด
			out.println("<tr>");
			out.println("<td>" + drink.getID() + "</td>");
			out.println("<td>" + drink.getName() + "</td>");
			out.println("<td>" + drink.getPrice() + "</td>");
			out.println("<td><a href=delete-menu?id=" + drink.getID() + "> Delete </a></td>"); // การส่ง id ไป... ทำให้servlet รู้ว่าเราทำกำลังลบข้อมูลตัวไหน
			
			out.println("</tr>");

		}
		out.println("</table>");
		out.println("<br>");
		out.println("<a href=index.jsp> Back to Home</a>");

		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
