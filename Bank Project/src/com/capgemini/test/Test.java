package com.capgemini.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;

import com.capgemini.bean.Account;
import com.capgemini.service.BankServiceClass;
/**
 * 
 * @author Satyam Singh
 *
 */
class Test {
	static BankServiceClass bservice;
	@BeforeAll
	public static void init()
	{
		bservice = new BankServiceClass(); 
	}
	@org.junit.jupiter.api.Test
	void test() {
		assertEquals("invalid", bservice.addAccount(new Account("hello", "", "hii", "howw",700995L , "Satyam", "Satyam", 200.0)));
	}
	
	
}
