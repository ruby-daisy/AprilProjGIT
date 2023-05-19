package ins.aiite.encapsulation;

public class BankTransactions {
	String name="daisy";
	String pwd="ru@123";
	private double balance=2000;//hiding data
	
	
	public double getBalance() {
		if ((this.name=="ruby") && (this.pwd=="ruby@123")) //validation
		{
			return balance;
		}
		else 
			return 0;
		
	}
	public void setBalance(double amount) {
		
		if ((this.name=="ruby") && (this.pwd=="ruby@123")) //validation
		{
			this.balance=this.balance+amount;
		}
		else
			System.out.println("Balance is not updated");
	}
	
	
	

}
