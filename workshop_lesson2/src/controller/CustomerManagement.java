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

import model.Customer;
import model.Drink;


@WebServlet("/customer-management")
public class CustomerManagement extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public CustomerManagement() {
        super();
    }

    @Override
	public void init() throws ServletException { // ������������������ list �����˹�Ҩ�Ẻ Drink ����㹵����
													// menuList ���¡�� manual �������
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer(1, "Kwan", "082475" , "abcde", "12345" ));
		customerList.add(new Customer(2, "jack", "082975" , "qwer", "7894" ));
		customerList.add(new Customer(3, "Noey", "064428" , "uiop", "4561" ));
		customerList.add(new Customer(4, "Team", "029951" , "jkl;", "1230" ));
		ServletContext context = getServletContext(); // servletcontext ��͡�÷���������֧ ����ö����ء���ء�����
		context.setAttribute("customerList", customerList); // set ��� menuList ����ء���ء�����
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");

		ServletContext context = getServletContext();

		List<Customer> customerList = (List<Customer>) context.getAttribute("customerList");
		response.setContentType("text/html1");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html><head><title> Customer Management</title></head>");
		out.println("<body>");
		out.println("<h1> Current Menu</h1>");

		out.println("<a href=addcustomerForm.jsp> Add Menu </a>");
		out.println("<table border='1'>"); // set��� ���ҧ�բͺ ˹� 1 px
		out.println("<tr><th>ID</th><th> Name </th> <th> Tel </th><th> Username </th><th> Password </th> </tr>"); // tr - table row, th - table header
																				// ������ǵ��ҧ �ʴ��繵��˹�

		for (Customer customer : customerList) { // loop 㹡�����觻��蹢������ menuList �����
			out.println("<tr>");
			out.println("<td>" + customer.getId() + "</td>");
			out.println("<td>" + customer.getName() + "</td>");
			out.println("<td>" + customer.getTel() + "</td>");
			out.println("<td>" + customer.getUsername() + "</td>");
			out.println("<td>" + customer.getPassword() + "</td>");
			out.println("<td><a href=delete-customer?id=" + customer.getId() + "> Delete </a></td>"); // ����� id �... �����servlet ��������ҷӡ��ѧź�����ŵ���˹
			
			out.println("</tr>");

		}
		out.println("</table>");
		out.println("<br>");
		out.println("<a href=index.jsp> Back to Home</a>");

		out.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
