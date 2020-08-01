package com.Suhana.SuhanaModel;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity


public class Transaction {
	@Id
	private int transId;
	private int transAmt;
	private int totalbalance;
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public int getTransAmt() {
		return transAmt;
	}
	public void setTransAmt(int transAmt) {
		this.transAmt = transAmt;
	}
	public int getTotalbalance() {
		return totalbalance;
	}
	public void setTotalbalance(int totalbalance) {
		this.totalbalance = totalbalance;
	}
	

}
