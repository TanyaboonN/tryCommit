package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/add-product")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");  
		
		String name = request.getParameter("name");  //get ��ҷ�� user ��͡�����кش��� name �ͧ input box ���㹷������� text1 
		String amount = request.getParameter("amount");
		String store = request.getParameter("store");
		
		PrintWriter jack = response.getWriter(); //class PrintWriter ���ʷ���տѧ��蹷���  print ˹��ྨ html �͡����·ѹ�շ�� user ���� form
												 // �����ҧ obj ���� jack �ҡ���� PrinWriter �������¡�� function �������㹤��� PrintWriter
			
			jack.println(" <h1>��������´�ͧ�Թ��ҷ������</h1> " + "�����Թ��� : "+ name + "<br/>" + "�ӹǹ�Թ��� : " + amount + "<br/>" + "������ͧ���Թ��� : " + store + "<br/>"
					 );
	}

}
