package com.capgemini.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import com.capgemini.bean.Account;
import com.capgemini.bean.Transaction;
/**
 * 
 * @author Satyam Singh
 *
 */
public class BankDaoClass implements BankDaoInterface {
	static ArrayList<Account> account = new ArrayList<Account>();
	static List<Transaction> transaction = new ArrayList<Transaction>();
	Transaction t = new Transaction();
	static
	{
		account.add(new Account("Satyam", "Singh", "Raghuwanshi", "Hello", 700995L, "Satyam", "RAnchi", 9999.0));
		transaction.add(new Transaction(700995L, "Deposit", new Date(), 9999.0));
		account.add(new Account("Satyam", "Singh", "Raghuwanshi", "Hello", 700995L, "Satyam", "RAnchi", 9999.0));
		transaction.add(new Transaction(700995L, "Deposit", new Date(), 9999.0));
	}

	@Override
	public String addAccount(Account a) {
		// TODO Auto-generated method stub
		account.add(a);
		return "Created";
	}

	@Override
	public String deposit(Long accountId, Double amount) {
		Double updateAmount =0.0;
		for(Account a:account)
		{
			if(a.getAccountId().equals(accountId) && amount>0)
			{
				{

					t = new Transaction();
					t.setAccountId(accountId);
					t.setAmount(amount);
					t.setD(new Date());
					t.setType("Deposit");
					transaction.add(t);
				}
				updateAmount =a.getBalance()+amount;
				a.setBalance(updateAmount);
				return "Completed";
			}
		}
		return "Invalid Amount";
		
	}

	@Override
	public String withDraw(Long accountId, Double amount) {
		
		Double updateAmount =0.0;
		for(Account a:account)
		{
			if(a.getAccountId().equals(accountId));
			{
				if(a.getBalance()>=amount){
				{
					t = new Transaction();
					t.setAccountId(accountId);
					t.setAmount(amount);
					t.setD(new Date());
					t.setType("Withdraw");
					transaction.add(t);
				}
				updateAmount = a.getBalance()-amount;
				a.setBalance(updateAmount);
				return "Completed";
			}
			}
		}
		return "Insufficient amount";
	}

	@Override
	public String fundTransfer(Long accountId1, Long accountId2, Double amount) {
		synchronized(this)
		{
 
			t = new Transaction();
			t.setAccountId(accountId1);
			t.setAmount(amount);
			t.setD(new Date());
			t.setType("Transfer Deposit");
			transaction.add(t);
			t = new Transaction();
			t.setAccountId(accountId2);
			t.setAmount(amount);
			t.setD(new Date());
			t.setType("Transfer Deposit");
			transaction.add(t);
			String status=withDraw(accountId1, amount);
			transaction.remove(transaction.size()-1);
			if(status.equals("Completed"))
			{
				deposit(accountId2, amount);
				transaction.remove(transaction.size()-1);
				return "Completed";
			}
			else
			{
				return "Invalid Amount";
			}
		}
	}

	@Override
	public void printTransaction(Long accountId) {

		for(Transaction t: transaction)
		{
			{
				System.out.println(t);
			}
		}
		
	}
	
	public Boolean uniqueIds(Long id)
	{
		List<Long> uniqueId = account.stream().map((e)->e.getAccountId()).collect(Collectors.toList());
		if(uniqueId.contains(id))
		{
			return true;
		}
		return false;
	}
	
	public Account listing(Long id)
	{
		for(Account a:account)
		{
			if(a.getAccountId().equals(id));
			{
				return a;
			}
		}
		return null;
	}
	public boolean checkAccount(Long id, String password)
	{
		for(Account a:account)
		{
			if(a.getAccountId().equals(id) && a.getPassword().equals(password))
				return true;
		}
		return false;
	}

	@Override
	public Double showBalance(Long accountId) {
		for(Account a:account)
		{
			if(a.getAccountId().equals(accountId))
					return a.getBalance();
		}
		return null;
	}


}
