package accountsystem;

import javax.swing.JOptionPane;

public class AccountSystem {

	public static void main(String[] args) {

		AccountList acl = new AccountList();
	
		boolean running = true;
			
		while(running){
			
			String name = JOptionPane.showInputDialog("Enter name:");
			if(name.equalsIgnoreCase("q")){
				running = false;
			}else{
				
				String bal = JOptionPane.showInputDialog("Enter balance:");
				double balance = Double.parseDouble(bal);
					
				acl.add(new BankAccount(name,balance));
			}
		}
		
		acl.viewAccounts();
		
		String rem = JOptionPane.showInputDialog("Select an account to empty\nExample 1 or 2 etc");
		int index = Integer.parseInt(rem);
		
		acl.remove(index);
		
		acl.viewAccounts();
		
		String acc1 = JOptionPane.showInputDialog("Select an account to debit by its index");
		int first = Integer.parseInt(acc1);
		String am = JOptionPane.showInputDialog("Enter amount to debit");
		double amount = Double.parseDouble(am);
		String acc2 = JOptionPane.showInputDialog("Select an account to credit by its index");
		int second = Integer.parseInt(acc2);
		
		acl.transfer(amount, acl.getAccount(first), acl.getAccount(second));
		
		acl.viewAccounts();
		
		JOptionPane.showMessageDialog(null, "Operation Successfull!");
	}

}
