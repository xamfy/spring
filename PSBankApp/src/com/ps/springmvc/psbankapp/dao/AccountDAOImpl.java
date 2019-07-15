package com.ps.springmvc.psbankapp.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import com.ps.springmvc.psbankapp.entity.AccountEntity;
import com.ps.springmvc.psbankapp.model.Account;

@Repository
public class AccountDAOImpl implements AccountDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean saveAccount(Account account) {
		boolean saveFlag = true;
		AccountEntity accountEntity = new AccountEntity();
		accountEntity.setAccNo(account.getAccountNo());
		accountEntity.setAccHolderName(account.getAccountHolderName());
		accountEntity.setBalance(account.getBalance());
		accountEntity.setAccountType(account.getAccountType());
		accountEntity.setDateOfBirth(account.getDateOfBirth());
		accountEntity.setPsCode(account.getPsCode());
		
		try {
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.save(accountEntity);
		} catch (Exception ex) {
			ex.printStackTrace();
			saveFlag = false;
		}
		
		return saveFlag;
	}
	
}
