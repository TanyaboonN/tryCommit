package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvestigateServlet
 */
@WebServlet("/investigate")
public class InvestigateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InvestigateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		
		String sugarString = request.getParameter("sugar");  //get ��ҷ�� user ��͡�����кش��� name �ͧ input box ���㹷������� tableNumber
		int sugar = Integer.parseInt(sugarString);
		String getClientName = request.getParameter("name");
		
		
		PrintWriter jack = response.getWriter();
		jack.println("<h1>�š���ԹԨ���</h1>");

		if(sugar > 125) {
			 String result = "";
			jack.println("���ͼ���Ѻ��õ�Ǩ : "+ getClientName + "<br/>"
					+ "�дѺ��ӵ������ʹ " + sugar + " ����ԡ���/ഫ��Ե�" + "<br/>" 
					+ "�š���ԹԨ��� : Diabetes : Consult a Doctor for a Treatment"	);		 
					 
		
			} else if(101 <= sugar && sugar <= 125 ) {
					;
					jack.println("���ͼ���Ѻ��õ�Ǩ : "+ getClientName + "<br/>"
							+ "�дѺ��ӵ������ʹ " + sugar + " ����ԡ���/ഫ��Ե�" + "<br/>" 
							+ "�š���ԹԨ��� :  Risk of diabetes -> Modify eating behavior"			 
							
							); 
		}
			else if(70 <= sugar && sugar <= 100 ) {
				
				jack.println("���ͼ���Ѻ��õ�Ǩ : "+ getClientName + "<br/>"
						+ "�дѺ��ӵ������ʹ " + sugar + " ����ԡ���/ഫ��Ե�" + "<br/>" 
						+ "�š���ԹԨ��� :  Normal"			 
						
						); 
			} 
			 else {
					jack.println("���ͼ���Ѻ��õ�Ǩ : "+ getClientName + "<br/>"
							+ "�дѺ��ӵ������ʹ " + sugar + " ����ԡ���/ഫ��Ե�" + "<br/>" 
							+ "�š���ԹԨ��� :  Take 15 gram of Carbohydrate -> 1 banana"
				);
		
	}

}}
