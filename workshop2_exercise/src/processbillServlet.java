

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/processbillServlet")
public class processbillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public processbillServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String gettableNumber = request.getParameter("tableNumber");  //get ค่าที่ user กรอกมาโดยระบุด้วย name ของ input box นั้นในที่นี้ก็คือ tableNumber
		String getcustName = request.getParameter("custName");
		double getpriceFood = Double.parseDouble(request.getParameter("priceFood"));
		double getpriceDrink = Double.parseDouble(request.getParameter("priceDrink"));
		double getpriceSweet = Double.parseDouble(request.getParameter("priceSweet"));
		
		double finalPrice = ((getpriceFood + getpriceDrink + getpriceSweet)*1.10)*1.07;
		//แปลง priceFood, Drink, Sweet ให้เป็น Double ด้วยการ parseDouble เพื่อให้มันเป็นเลข จะได้ + - * / ได้
		PrintWriter jack = response.getWriter();
		
		jack.println("<h1 style=\"text-align : center\">ร้านทะเลหวาน</h1>\r\n" + 
				"	<a href=\"index.jsp\"> หน้าหลัก  </a> |\r\n" + 
				"	<a href=\"billform.jsp\"> จ่ายค่าอาหาร  </a> |\r\n" + 
				"	<a href=\"###.jsp\"> ใบเสร็จค่าอาหาร   </a> |\r\n" + 
				"	\r\n" + 
				"	<hr>\r\n" + 
				"	\r\n" + 
				"	<h3>ใบเสร็จค่าอาหาร</h3>");
		
		jack.println("โต๊ะที่ " + gettableNumber + "<br/>" 
				+ "ชื่อลูกค้า " + getcustName + "<br/>"
				+ "ค่าอาหาร " + getpriceFood + " บาท" + "<br/>" 
				+ "ค่าเครื่องดื่ม " + getpriceDrink + " บาท" + "<br/>" 
				+ "ค่าของหวาน " + getpriceSweet + " บาท" + "<br/>" 
				+ "ภาษี 7%" + "<br/>"
				+ "ค่าบริการ 10% "  + "<br/>"
				+ "ค่าใช้จ่ายสุทธิ  " + finalPrice + " บาท" 
				); 
	}

}
