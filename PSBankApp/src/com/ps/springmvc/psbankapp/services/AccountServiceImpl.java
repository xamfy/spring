package com.ps.springmvc.psbankapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ps.springmvc.psbankapp.dao.AccountDAO;
import com.ps.springmvc.psbankapp.model.Account;

@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	AccountDAO accountDAO;
	
	@Override
	@Transactional
	public boolean saveAccount(Account account) {
		return accountDAO.saveAccount(account);
	}
}
