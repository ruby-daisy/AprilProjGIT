package ins.aiite.encapsulation;

public class NetBanking {
	public static void main(String[] args) {
		BankTransactions bt = new BankTransactions();
		double currentBal = bt.getBalance();
		System.out.println(currentBal);
		bt.setBalance(10000);
		currentBal = bt.getBalance();
		System.out.println(currentBal);

	}

}
