package accountsystem;

public class BankAccount {
	
	private String name;
	private double balance;
	
	public BankAccount(String n, double b){
		name = n;
		balance = b;
	}
	
	public void setName(String n){
		name = n;
	}
	
	public String getName(){
		return name;
	}
	
	public void setBalance(double b){
		balance = b;
	}
	
	public double getBalance(){
		return balance;
	}

}
