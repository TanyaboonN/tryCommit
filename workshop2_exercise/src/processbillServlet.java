

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
		
		String gettableNumber = request.getParameter("tableNumber");  //get ��ҷ�� user ��͡�����кش��� name �ͧ input box ���㹷������� tableNumber
		String getcustName = request.getParameter("custName");
		double getpriceFood = Double.parseDouble(request.getParameter("priceFood"));
		double getpriceDrink = Double.parseDouble(request.getParameter("priceDrink"));
		double getpriceSweet = Double.parseDouble(request.getParameter("priceSweet"));
		
		double finalPrice = ((getpriceFood + getpriceDrink + getpriceSweet)*1.10)*1.07;
		//�ŧ priceFood, Drink, Sweet ����� Double ���¡�� parseDouble ��������ѹ���Ţ ���� + - * / ��
		PrintWriter jack = response.getWriter();
		
		jack.println("<h1 style=\"text-align : center\">��ҹ������ҹ</h1>\r\n" + 
				"	<a href=\"index.jsp\"> ˹����ѡ  </a> |\r\n" + 
				"	<a href=\"billform.jsp\"> ���¤�������  </a> |\r\n" + 
				"	<a href=\"###.jsp\"> ����稤�������   </a> |\r\n" + 
				"	\r\n" + 
				"	<hr>\r\n" + 
				"	\r\n" + 
				"	<h3>����稤�������</h3>");
		
		jack.println("��з�� " + gettableNumber + "<br/>" 
				+ "�����١��� " + getcustName + "<br/>"
				+ "�������� " + getpriceFood + " �ҷ" + "<br/>" 
				+ "�������ͧ���� " + getpriceDrink + " �ҷ" + "<br/>" 
				+ "��Ңͧ��ҹ " + getpriceSweet + " �ҷ" + "<br/>" 
				+ "���� 7%" + "<br/>"
				+ "��Һ�ԡ�� 10% "  + "<br/>"
				+ "���������ط��  " + finalPrice + " �ҷ" 
				); 
	}

}
