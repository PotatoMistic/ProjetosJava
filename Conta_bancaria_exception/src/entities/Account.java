package entities;

import java.util.InputMismatchException;

public class Account {

private Integer accountNumber;
private String holder;
private Double balance;
private Double withdrawLimit;


public Integer getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(Integer accountNumber) {
	this.accountNumber = accountNumber;
}
public String getHolder() {
	return holder;
}
public void setHolder(String holder) {
	this.holder = holder;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}
public Double getWithdrawLimit() {
	return withdrawLimit;
}
public void setWithdrawLimit(Double withdrawLimit) {
	this.withdrawLimit = withdrawLimit;
}

public void deposit(double quantity) {
	this.balance = balance + quantity;
}

public void withdraw (double quantity) {
	if (quantity > this.balance) {
		throw new InputMismatchException("O valor de saque deve ser menor que o saldo da conta");
	}
	if (quantity > getWithdrawLimit()) {
		throw new InputMismatchException("O saque desejado é maior que o limite da conta");
	}
	
	this.balance = balance - quantity;
}
public Account () {
	
}
public Account(Integer accountNumber, String holder, Double balance, Double withdrawLimit) {
	super();
	this.accountNumber = accountNumber;
	this.holder = holder;
	this.balance = balance;
	this.withdrawLimit = withdrawLimit;
}





}
