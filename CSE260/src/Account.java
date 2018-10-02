//everett yang, SBU ID 111756324
import java.util.Date;
public class Account {
	private int id;
	private double balance, annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		id = 0;
		balance = 1000;
		annualInterestRate = 4.50;
		dateCreated = new java.util.Date();
	}
	
	public Account(int newID, double newBalance) {
		id = newID;
		balance = newBalance;
	}
	
	public int getID() {
		return id;
	}
	
	public void setID(int newID) {
		id = newID;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double newBalance) {
		balance = newBalance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double newInterest) {
		annualInterestRate = newInterest;
	}
	
	public Date getDate() {
		return dateCreated;
	}
	
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	public void withDraw(double amount) {
		if(amount > balance) {
			System.out.println("There is not enough money to be withdrawn! ");
		}
		else {
			this.setBalance(balance - amount);
		}
	}
	
	public void deposit(double amount) {
		this.setBalance(balance + amount);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
