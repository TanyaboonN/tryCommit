
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// /friendformServlet ���Ͷ֧ servlet ��� ��������
@WebServlet("/friendformServlet")
public class friendformServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public friendformServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");  //27-28 �鴷���������ʴ����Ѿ��������������
		
		String name = request.getParameter("text1");  //get ��ҷ�� user ��͡�����кش��� name �ͧ input box ���㹷������� text1 
		String surName = request.getParameter("text2");
		String address = request.getParameter("text3");
		String phone = request.getParameter("text4");
		
		PrintWriter jack = response.getWriter(); //class PrintWriter ���ʷ���տѧ��蹷���  print ˹��ྨ html �͡����·ѹ�շ�� user ���� form
												 // �����ҧ obj ���� jack �ҡ���� PrinWriter �������¡�� function �������㹤��� PrintWriter
			jack.println(" <h1>����������س</h1> " + "���� : "+ name + "<br/>" + "���ʡ�� : " + surName + "<br/>" + "������� : " + address + "<br/>"
					+ "�������Ѿ�� : " + phone  + " �����͹����<br> "); 
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");  
		
		String name = request.getParameter("text1");  //get ��ҷ�� user ��͡�����кش��� name �ͧ input box ���㹷������� text1 
		String surName = request.getParameter("text2");
		String address = request.getParameter("text3");
		String phone = request.getParameter("text4");
		
		PrintWriter jack = response.getWriter(); //class PrintWriter ���ʷ���տѧ��蹷���  print ˹��ྨ html �͡����·ѹ�շ�� user ���� form
												 // �����ҧ obj ���� jack �ҡ���� PrinWriter �������¡�� function �������㹤��� PrintWriter
			
			jack.println(" <h1>����������س</h1> " + "���� : "+ name + "<br/>" + "���ʡ�� : " + surName + "<br/>" + "������� : " + address + "<br/>"
					+ "�������Ѿ�� : " + phone  + " �����͹����<br> "); 
	}

}
