package com.capgemini.pl;

import java.io.Console;
import java.util.Scanner;

import com.capgemini.bean.Account;
import com.capgemini.service.BankServiceClass;
/**
 * 
 * @author Satyam Singh
 *
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankServiceClass bservice;
		Account account;
		int count=0;
		
		while(true)
		{
			try
			{
			System.out.println("1. Enter to create a new Account");
			System.out.println("2. Enter to Login");
			System.out.println("3. Enter to exit");
			Scanner sc = new Scanner(System.in);
			
			count=sc.nextInt();
			Console cnsole = null;
			switch(count)
			{
				case 1:
					account = new Account();
					bservice = new BankServiceClass();
					System.out.println("First Name: ");
					String str = sc.nextLine();
					str = sc.nextLine();
					account.setFirstName(str);
					System.out.println("Last Name: ");
					String lastName=sc.nextLine();
					account.setLastName(lastName);
					System.out.println("Father's Name: ");
					String fatherName=sc.nextLine();
					account.setFathersName(fatherName);
					System.out.println("Mother's Name: ");
					String motherName=sc.nextLine();
					account.setMothersName(motherName);
					System.out.println("Address:");
					String address=sc.nextLine();
					account.setAddress(address);
					System.out.println("Password");
					String password = sc.next();
					System.out.println("Re-enter Password:");
					String rePassword = sc.next();
					bservice = new BankServiceClass();
					if(bservice.validate(password,rePassword))
					{
						account.setPassword(password);
					}
					else
					{
						System.out.println("Password don't match");
						continue;
					}
					String c=bservice.addAccount(account);
					System.out.println(c);
					
					break;
				case 2:
					bservice = new BankServiceClass();
					System.out.println("Enter the account id");
					Long id = sc.nextLong();
					boolean flag=bservice.checkUniqueId(id);
					if(flag)
					{
						System.out.println("Enter the password");
						String pass = sc.next();
						
						if(bservice.checkAccount(id, pass))
						{
							a:
							while(true) {
							System.out.println("1. To check the Balance");
							System.out.println("2. To deposit");
							System.out.println("3. To WithDraw");
							System.out.println("4. To fund transfer");
							System.out.println("5. To Print Transactions");
							System.out.println("6. To Logout");
							int temp=sc.nextInt();
							switch(temp)
							{
							case 1:
								System.out.println(bservice.showBalance(id));
								continue;
							case 2:
								System.out.println("Enter the account to deposite");
								Double amount=sc.nextDouble();
								bservice.deposit(id, amount);
								System.out.println("Updated balance " + bservice.showBalance(id));
								break;
							case 3:
								System.out.println("Enter the account to withdraw");
								Double amountWith = sc.nextDouble();
								bservice.withDraw(id, amountWith);
								System.out.println("Updated balance " + bservice.showBalance(id));
								break;
							case 4:
								System.out.println("Enter the Account No to which you want to transfer the amount");
								Long id2 = sc.nextLong();
								if(bservice.checkUniqueId(id2) && !id.equals(id2))
								{
									System.out.println("Enter the amount to get transfered");
									Double amt = sc.nextDouble();
									System.out.println(bservice.fundTransfer(id, id2, amt));
									System.out.println("Updated balance " + bservice.showBalance(id));
								}
								else
								{
									System.out.println("Invalid");
								}
								break;
							case 5:
								bservice.printTransaction(id);
								break;
							case 6:
								break a;
							default:
								System.out.println("Invalid command");	
							}
							}
						}
					}
					else
					{
						System.out.println("Invalid");
					}
					break;
				case 3:
				{
					System.exit(0);
				}
				break;
				default:
					System.out.println("Invalid command Entered");	
				}
			}
			catch(Exception e)
			{
				System.out.println("Enter the valid data:");
				continue;
			}
		}
	}
	
	}
