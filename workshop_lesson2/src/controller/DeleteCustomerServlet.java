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
		
		ServletContext context = getServletContext(); //servlet context คือการทำให้ตัวmenuList สามารถใช้ได้ทุกที่ แบบข้ามคลาสกันได้ผ่าน servlet context
		
		List<Customer> customerList = (List<Customer>) context.getAttribute("customerList");
		
		Customer customerToRemove = null;
		for (Customer d : customerList) { //เป็นการวนลูปหาใน menuList ว่า บรรทัดไหนมี id ตรงกับที่เราคลิกลบ ถ้ามันตรงก็จะจบบรรทัดที่มี id นั้น,, d: menuList คือเอาข้อมูลใน menuList ไปใส่ไว้ในตัวแปร d 
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
