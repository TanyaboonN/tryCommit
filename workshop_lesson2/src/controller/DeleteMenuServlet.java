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


@WebServlet("/delete-menu")
public class DeleteMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DeleteMenuServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		ServletContext context = getServletContext(); //servlet context ��͡�÷������menuList ����ö����ء��� Ẻ�������ʡѹ���ҹ servlet context
		
		List<Drink> menuList = (List<Drink>) context.getAttribute("menuList");
		
		Drink drinkToRemove = null;
		for (Drink d : menuList) { //�繡��ǹ�ٻ��� menuList ��� ��÷Ѵ�˹�� id �ç�Ѻ�����Ҥ�ԡź ����ѹ�ç��Ш���÷Ѵ����� id ���,, d: menuList �����Ң������ menuList �������㹵���� d 
			if (d.getID() == id ) {
				drinkToRemove = d ;
				break;
			}
		}
		menuList.remove(drinkToRemove);
		response.sendRedirect("drink-management");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
