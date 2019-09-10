package com.bank.web.daos;

import com.bank.web.domains.CustomerBean;

public interface MemberDAO {
	public void insertCustomer(CustomerBean param);
	public CustomerBean login (CustomerBean param);

}
