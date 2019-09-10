package com.bank.web.serviceImpls;

import com.bank.web.daoImpls.MemberDAOImpl;
import com.bank.web.daos.MemberDAO;
import com.bank.web.domains.CustomerBean;
import com.bank.web.services.MemberService;

public class MemberServiceImpl implements MemberService{
	private MemberDAO dao;
	
	public MemberServiceImpl() {
		
	dao = new MemberDAOImpl();
	
	}
	public void join (CustomerBean param) {
		dao.insertCustomer(param);
	}
	public CustomerBean login(CustomerBean param) {
		return dao.login(param);
	}
}
