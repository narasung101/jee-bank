package com.bank.web.controllers;

import com.bank.web.enums.Action;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bank.web.command.Receiver;
import com.bank.web.command.Sender;

@WebServlet("/customer.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Receiver.init(request);
		String action = (request.getParameter("action")==null) ? "MOVE"
				: Action.valueOf(request.getParameter("action").toUpperCase()).toString();
		switch(Action.valueOf(action)) {
		case LOGIN :
			if(request.getAttribute("LOGIN").equals("SUCCESS")) {
				Sender.forward(request,response);
			}else {
				Sender.redirect(request, response, "/customer.do?page=login");
			}
			break;
			default :
				Sender.forward(request, response); break;
		}

	}

}
