package com.Suhana.SuhanaModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Holder {
	
	@Id
	private int accNum;
	private String userName;
	private int balance;
	public int getAccNum() {
		return accNum;
	}
	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
