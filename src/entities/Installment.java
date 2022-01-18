package entities;

import java.util.Date;

public class Installment {
	private Date date;
	private double amount;
	
	public Installment(Date date, double amount) {
		this.date = date;
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
