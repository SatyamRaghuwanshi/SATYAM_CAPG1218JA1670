package com.capgemini.service;

import java.util.List;

import com.capgemini.bean.Account;
import com.capgemini.bean.Transaction;
import com.capgemini.dao.BankDaoClass;
import com.capgemini.dao.BankDaoInterface;
/**
 * 
 * @author Satyam Singh
 *
 */
public class BankServiceClass implements BankServiceInterface {
	BankDaoClass bdao;
	
	@Override
	public String addAccount(Account a) {
		if(a.getFirstName().length()>=3 && a.getLastName().length()>=3 && a.getFathersName().length()>=3 &&
				a.getMothersName().length()>=3 && a.getAddress().length()>=6)
		{
			Long max=9999999L;
			Long min=10000000L;
			Long rand; 
			boolean flag=true;
			do {
				rand = (long) (Math.random()*(max-min+1)+min);
				flag=checkUniqueId(rand);
			}while(flag==true);
			a.setAccountId(rand);
			bdao = new BankDaoClass();
			Account list = new Account();
			String str=bdao.addAccount(a);
			list = listing(rand);
			if(str.equalsIgnoreCase("created"))
			{
				str = "Full Name:"+a.getFirstName()+" "+a.getLastName()+" "+"account Id:"+" "+rand;
			}
			return str;
		}
		return "invalid";
	}

	public boolean checkUniqueId(Long rand) {
		// TODO Auto-generated method stub
		bdao = new BankDaoClass();
		boolean flag=bdao.uniqueIds(rand);
		return flag;
	}

	@Override
	public String deposit(Long accountId, Double amount) {
		// TODO Auto-generated method stub
		if(amount>0)
		{
			bdao=new BankDaoClass();
			bdao.deposit(accountId, amount);
		}
		
		return "success";
	}

	@Override
	public String withDraw(Long accountId, Double amount) { 
		if(amount>0)
		{
			bdao=new BankDaoClass();
			return bdao.withDraw(accountId, amount);
		}
		return "Invalid Amount";
	}

	@Override
	public Double showBalance(Long accountId) {
		bdao=new BankDaoClass();
		return bdao.showBalance(accountId);
	}

	@Override
	public String fundTransfer(Long accountId1, Long accountId2, Double amount) {
		bdao = new BankDaoClass();
		if(amount>0)
		{
			return bdao.fundTransfer(accountId1, accountId2, amount);
		}
		return "Invalid amount";
	}

	@Override
	public void printTransaction(Long accountId) {
		// TODO Auto-generated method stub
		bdao.printTransaction(accountId);
	}

	public boolean validate(String password, String rePassword) {
		if(password.equals(rePassword))
		{
			return true;
		}
		return false;
		
	}
	public boolean checkAccount(Long id, String password)
	{
		return bdao.checkAccount(id, password);
	}
	public Account listing(Long id)
	{
		bdao =new BankDaoClass();
		return bdao.listing(id);
	}
}
