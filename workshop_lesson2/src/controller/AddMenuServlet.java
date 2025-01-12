package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Drink;

@WebServlet("/add-menu")
public class AddMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddMenuServlet() {
        super();
    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
//			String idString = request.getParameter("id");
//			int id = Integer.parseInt(idString); 
			String name = request.getParameter("name");
			String priceString = request.getParameter("price"); //price �������Ҩҡ input text �ѹ�� String
			int price = Integer.parseInt(priceString); // �����������ŧ�� int ����������� + - ��
			
			ServletContext context = getServletContext(); //servlet context ��͡�÷���������֧ ����ö����ء���ء�����
			
			List<Drink> menuList = (List<Drink>) context.getAttribute("menuList");
			
//			int id = menuList.size() + 1;
			int id =1;
			if(!menuList.isEmpty()) {
				Drink lastdrink = menuList.get(menuList.size()-1);
				id = lastdrink.getID()+1; // �� logic 㹡������� id �ش���¤������ �¡���� index ��ͧlist ����ش��������դ������� �ҡ�������ѹ + ���� 1 ��Ҩ��� id �ͧ�����ŷ����ҡ��ѧ add ��ǶѴ�
				
			}
			Drink d1 = new Drink(id,name,price);
			menuList.add(d1);
			response.sendRedirect("drink-management");
	}
	

}
