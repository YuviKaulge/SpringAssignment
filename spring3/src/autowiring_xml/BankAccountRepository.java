package autowiring_xml;

public interface BankAccountRepository 
{
   public double getBalance(long accountId);
   public double updateBalance(long accountId,double newBalance);
   
	 
   
}
