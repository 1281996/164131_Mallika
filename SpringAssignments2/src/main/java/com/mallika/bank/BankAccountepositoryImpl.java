package com.mallika.bank;

import java.util.ArrayList;

public class BankAccountepositoryImpl  {
	//BankAccountRepositoryDAO obj = new BankAccountRepositoryDAO();
	ArrayList<BankAccount> bankAccount;
  
	public ArrayList<BankAccount> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(ArrayList<BankAccount> bankAccount) {
		this.bankAccount = bankAccount;
	}

	public double getBalance(long accountId) {

		for (BankAccount index : bankAccount) {
			if (index.getAccountId() == accountId) {
				return index.getAccountBalance();

			}
		}
		return 0.0;
	}

	public double updateBalance(long accountId, double balance, String option) {

		double newBalance = 0;

		for (BankAccount index : bankAccount) {
			if (option.equals("withdraw")) {
				if (index.getAccountId() == accountId) {
					newBalance = index.getAccountBalance() - balance;
					
				}
			}

			else if (option.equals("deposit")) {
				if (index.getAccountId() == accountId) {
					newBalance = index.getAccountBalance() + balance;
				}
			}
		}
		return newBalance;

	}

}
