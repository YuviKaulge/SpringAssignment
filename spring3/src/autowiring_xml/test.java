package autowiring_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test 
{
	public static void main(String args[])
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("spring2.xml");
		BankAccount bank1=	context.getBean("bankaccount",BankAccount.class);
		BankAccountController bank=	context.getBean("bankcontroller",BankAccountController.class);
		System.out.println(bank.deposit(0, 0));
		System.out.println(bank.fundTransfer(0, 0, 0));
		System.out.println(bank.withdraw(0, 0));
		System.out.println(bank.getBalance(0));
		
	}

}
