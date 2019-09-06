package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.pool.Constants;

public class Carrier {
	public static void forward(HttpServletRequest request,
			HttpServletResponse response, MoveCommand cmd) {
		System.out.println("캐리어내부 :" +Receiver.cmd.getView());
		try {
			request.getRequestDispatcher
			(cmd.getView())
			.forward(request, response);		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
