package com.mallika.bank;

public class BankAccountServiceImpl  {
	BankAccountepositoryImpl accountRepository=null;
	
	public BankAccountepositoryImpl getAccountRepository() {
		return accountRepository;
	}

	public void setAccountRepository(BankAccountepositoryImpl accountRepository) {
		this.accountRepository = accountRepository;
	}

	
	public double withdraw(long accountId, double balance,String option) {
		
		
		return accountRepository.updateBalance(accountId, balance,option); 
	}


	public double deposit(long accountId, double balance, String option ) {
		
		return accountRepository.updateBalance(accountId, balance, option);
	}


	public double getBalance(long accountId) {
		
		
		
		
		return  accountRepository.getBalance(accountId);
	}


	public boolean fundTransfer(long fromAccount, long toAccount, double amont) {
		
		
		
		return false;
	}

	
	
}
