package newdaypackage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	private String type;
	private double amount;
	private LocalDateTime time_stamp;
	
	public Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
		
		this.time_stamp = LocalDateTime.now();
	}
	
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String transaction = "Type=" + type + ", amount=" + String.format("%.2f", amount) + ", time_stamp=" + time_stamp.format(formatter);
		return transaction;
	}
	
}
