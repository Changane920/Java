package Encapsulation_EX;

public class E_5 {
	public static void main(String[] args) {
		Account a1 = new Account("A01", "Aung Aung", 1000);
		Account a2 = new Account("A02", "Aung Cho");
		
		System.out.println(a1);
		a1.credit(2000);
		System.out.println(a1);
		a1.debit(1000);
		System.out.println(a1);

		System.out.println("Transfer");
		System.out.println("Before transfer!");
		System.out.println(a2);
		System.out.println("After transfer!");
		a1.transferTo(a1, a2, 500);
		System.out.println(a1);
		System.out.println(a2);
	}

}
class Account{
	private String id, name;
	private int balance = 0;
	
	Account(String i, String n){
		this.id = i;
		this.name = n;
	}
	Account(String i, String n, int b){
		this.id = i;
		this.name = n;
		this.balance = b;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	
	int credit(int amount) {
		balance = amount;
		return balance;
	}
	
	int debit(int amount) {
		if(amount <= balance) {
			balance -= amount;
		}
		else{
			System.out.println("Amount exceeded balance.");
		}
		return balance;
	}
	int transferTo(Account acc1, Account acc2, int amount	) {
		if(amount <= balance) {
			acc1.balance -= amount;
			acc2.balance += amount;
		}
		else {
			System.out.println("Amount exceeded balance.");
		}
		return balance;
	}
	@Override
	public String toString() {
		return "[id = " + getId() + " name = " + getName() + " balance = " + getBalance() + "]";
	}
}