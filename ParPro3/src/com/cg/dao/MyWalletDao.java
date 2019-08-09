package com.cg.dao;

import java.util.List;

import com.cg.bean.MyWallet;

public interface MyWalletDao {
	
	public String create(MyWallet m);

	public String showBal(int acc);

	public String deposit(int acc, double amount);

	public String withdraw(int acc, double amount);

	public String fundTransfer(int acc1, int acc2, double amount);

	public List<String> print(int acc);

}
