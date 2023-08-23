package entities;

public class AccountInfo {

	private int accountNumber;
	private double balance;
	public String name;
	
	
	
	public int setAccountNumber (int number) {
		this.accountNumber = number;
		return number;
		}
	public double initialBalance (double value) {
		balance = balance + value;
		return balance;
		}
	public int getAccountNumber() {
		return accountNumber;
	    }
    public double getBalance ()    {
	   return balance;
        }
    public void setDeposit(double value) {
	   balance = balance + value;
       }
   public void setWithdraw(double value) {
	   balance = balance - value -5;
	   }
   public String toString () {
	   return "Account data: "
			   + "Account: " 
			   + accountNumber
			   + ", Holder: " 
			   + name
	           + ", Balance: R$" 
	           + balance;
	           
   }
}
