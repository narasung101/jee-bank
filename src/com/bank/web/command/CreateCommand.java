package com.bank.web.command;

import javax.servlet.http.HttpServletRequest;

import com.bank.web.domains.CustomerBean;
import com.bank.web.serviceImpls.MemberServiceImpl;
import com.bank.web.services.MemberService;

public class CreateCommand extends MoveCommand{
	public CreateCommand(HttpServletRequest request) throws Exception {
		super(request);
	}
	public void execute() {
		super.execute();
		CustomerBean param = new CustomerBean();
		MemberService service = new MemberServiceImpl();
		param.setId(request.getParameter("id"));
		param.setName(request.getParameter("name"));
		param.setPw(request.getParameter("pw"));
		param.setSsn(request.getParameter("ssn"));
		param.setCredit(request.getParameter("credit"));
		service.join(param);
		Receiver.cmd.setPage("login");
	}
}
