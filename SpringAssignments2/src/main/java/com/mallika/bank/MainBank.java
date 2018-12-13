package com.mallika.bank;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class MainBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		 ApplicationContext context =new ClassPathXmlApplicationContext("springbank.xml");
	     
		 BankAccountController accountcontrollerImpl= context.getBean(BankAccountController.class);
	    
	    System.out.println(accountcontrollerImpl.deposit(101,1007,"deposit"));
	    System.out.println(accountcontrollerImpl.deposit(101,100,"withdraw"));
	    System.out.println(accountcontrollerImpl.deposit(101,100,"deposit"));
	}

}
