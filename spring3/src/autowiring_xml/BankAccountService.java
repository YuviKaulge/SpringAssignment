package autowiring_xml;

public interface BankAccountService 
{
	public double withdraw(long accountId,double balance);
	public double deposit();
	public double getBalance(long accountId);
	public boolean fundTransfer(long fromAccount,long toAccount,double amount);

}
