package com.bank.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.command.Command;
import com.bank.web.command.MoveCommand;
import com.bank.web.command.Order;
import com.bank.web.command.Receiver;
import com.bank.web.domains.CustomerBean;
import com.bank.web.pool.Constants;
import com.bank.web.serviceimpl.MemberServiceImpl;
import com.bank.web.services.MemberService;
import com.sun.xml.internal.ws.wsdl.writer.document.Service;

@WebServlet("/customer.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerBean param = new CustomerBean();
		MemberService service = new MemberServiceImpl();
		Order cmd = null;
		Receiver.init(request);
		Receiver.cmd.execute();
		try {
			cmd = new MoveCommand(request);
			cmd.execute();
		}catch (Exception e1) {
			e1.printStackTrace();
		}
		switch (request.getParameter("action")) {
		case "move": 
			request.getRequestDispatcher
			(String.format(Constants.VIEW_PATH,"customer", 
					request.getParameter("dest")))
			.forward(request, response);     //����Ʈ�� �̹� ���� �������ְ�, jsp���� �̵��ϸ� ������ ������ �����ϱ� �극��ũ�� �ִ°�
		break;
		case "join" :
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String ssn = request.getParameter("ssn");
		String credit = request.getParameter("credit");    //����.jsp���� ���� �Է��ϸ� �׼��� �Ͼ ��Ʈ�ѷ� �������� ����!
		param.setName(name);
		param.setId(id);
		param.setPw(pw);
		param.setSsn(ssn);
		param.setCredit(credit);
		System.out.println("ȸ������ : " +param.toString());
		service.join(param);
		request.getRequestDispatcher
		(String.format(Constants.VIEW_PATH,"customer", 
				request.getParameter("dest")))
		.forward(request, response);
		break;
		
		case "login" : 
			id = request.getParameter("id");  
			pw = request.getParameter("pw");
			System.out.printf("�α��� ���� ���� id: %s,pw: %s", id,pw);
			param = new CustomerBean();
			param.setId(id);
			param.setPw(pw);
			CustomerBean cust = service.login(param);
			System.out.println("������ cust��"+cust);
			if(id.equals(cust.getId())&&pw.equals(cust.getPw())) {
				request.setAttribute("customer", cust);
				System.out.println("���� cust��"+cust);	
				request.getRequestDispatcher                   
				(String.format(Constants.VIEW_PATH,"customer", 
						request.getParameter("dest")))
				.forward(request, response); 
			}
			else {
				System.out.println("���� cust��"+cust);
				request.getRequestDispatcher                   
				(String.format(Constants.VIEW_PATH,"customer", 
						request.getParameter("action")))
				.forward(request, response); 
			}
			

//				request.setAttribute("customer", cust);
//			request.getRequestDispatcher                   
//			(String.format(Constants.VIEW_PATH,"customer", 
//					request.getParameter("dest")))
//			.forward(request, response); 
			break;

		case "existId" : break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

