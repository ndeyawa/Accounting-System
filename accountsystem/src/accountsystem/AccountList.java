package accountsystem;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class AccountList {
	
	private ArrayList<BankAccount> accounts;
	
	public AccountList(){
		accounts = new ArrayList<BankAccount>();
	}
	
	public void add(BankAccount ba){
		accounts.add(ba);
	}
	
	public void remove(int index){
		accounts.get(index).setName(null);
		accounts.get(index).setBalance(0.0);
	}
	
	public void transfer(double amount, BankAccount a, BankAccount b){
		a.setBalance(a.getBalance() - amount);
		b.setBalance(b.getBalance() + amount);
	}
	
	public boolean equal(BankAccount a, BankAccount b){
		
		if(a.getBalance() == b.getBalance())
			return true;
		else
			return false;
	}
	
	public BankAccount getAccount(int index){
		return accounts.get(index);
	}
	
	public void viewAccounts(){
		String output = "";
		for(int i=0; i<accounts.size(); i++){
			output+= "Account Name: "+accounts.get(i).getName()+", Acount Balance:"+accounts.get(i).getBalance()+"\n";
		}
		JOptionPane.showMessageDialog(null, output);
	}

}
