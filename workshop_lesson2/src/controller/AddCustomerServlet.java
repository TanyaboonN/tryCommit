package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;


@WebServlet("/add-customer")
public class AddCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AddCustomerServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

			String inputname = request.getParameter("name").trim();
			String tel = request.getParameter("tel"); 
			String username = request.getParameter("username"); 
			String password = request.getParameter("password"); 


			ServletContext context = getServletContext(); //servlet context คือการทำให้ตัวแปรๆนึง สามารถใช้ได้ทุกที่ทุกเมื่อ
			
			List<Customer> customerList = (List<Customer>) context.getAttribute("customerList");
			int found = 0;
			for (Customer customer : customerList) {
				if (customer.getName().equals(inputname)) {
					 found =1 ;
					 break;
					
				}
				
			}
			if (found == 0) {
				int id = 1;
				if(!customerList.isEmpty()) {
					Customer lastCustomer = customerList.get(customerList.size()-1);
					id = lastCustomer.getId()+1;
					
				}
				Customer c1 = new Customer(id,inputname,tel,username,password);
				customerList.add(c1);
				response.sendRedirect("customer-management");
			} else {
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("ชื่อลูกค้าซ้ำกัน"                   );
				out.println("<br>Duplicate Name!!");
				out.println("<br><a href=customer-management> Back to Customer Management </a>");
				
			}
		
	
		
		
	}

}
