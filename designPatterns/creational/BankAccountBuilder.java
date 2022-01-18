package designPatterns.creational;

public class BankAccountBuilder {
	private long accountNumber;
	private String owner;
	private String branch;
	private double balance;
	private double interestRate;

	public BankAccountBuilder(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BankAccountBuilder withOwner(String owner) {
		this.owner = owner;
		return this;
	}

	public BankAccountBuilder atBranch(String branch) {
		this.branch = branch;
		return this;
	}

	public BankAccountBuilder startingBalance(double balance) {
		this.balance = balance;
		return this;
	}

	public BankAccountBuilder withInterest(double interestRate) {
		this.interestRate = interestRate;
		return this;
	}

	public BankAccount build() {
		BankAccount account = new BankAccount();
		account.setAccountNumber(this.accountNumber);
		account.setOwner(this.owner);
		account.setBranch(this.branch);
		account.setBalance(this.balance);
		account.setInterestRate(this.interestRate);
		return account;
	}

}
