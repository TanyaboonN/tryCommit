package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import model.Drink;


@WebServlet("/delete-customer")
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public DeleteCustomerServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idString = request.getParameter("id");
		int id = Integer.parseInt(idString);
		
		ServletContext context = getServletContext(); //servlet context ��͡�÷������menuList ����ö����ء��� Ẻ�������ʡѹ���ҹ servlet context
		
		List<Customer> customerList = (List<Customer>) context.getAttribute("customerList");
		
		Customer customerToRemove = null;
		for (Customer d : customerList) { //�繡��ǹ�ٻ��� menuList ��� ��÷Ѵ�˹�� id �ç�Ѻ�����Ҥ�ԡź ����ѹ�ç��Ш���÷Ѵ����� id ���,, d: menuList �����Ң������ menuList �������㹵���� d 
			if (d.getId() == id ) {
				customerToRemove = d ;
				break;
			}
		}
		customerList.remove(customerToRemove);
		response.sendRedirect("customer-management");	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
