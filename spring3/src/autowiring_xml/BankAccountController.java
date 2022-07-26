package autowiring_xml;

public class BankAccountController 
{
    BankAccount acc;
    double mainbalance=	acc.getAccountBalance();
    
    
    
	
	public BankAccount setAcc(BankAccount Acc) {
		return this.acc=acc;
	}

	
	public double withdraw(long accountId,double balance)
	{
	
		
		return mainbalance=mainbalance-balance;
		
	}
	
	public double deposit(long accountId,double balance)
	{
		
		
		return mainbalance +=balance;
	
		
		
	}
	public double getBalance(long accountId)
	{
		return accountId;
		
	}
	public boolean fundTransfer(long fromAccount,long toAccount,double amount)
	{
		return false;
		
	}
	
	
}
