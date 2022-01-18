package service;

public class PaypalService implements OnlinePaymentService {
	
	private static final double FEE_PERCENTAGE = 0.02;
	private static final double MONTHLY_INTEREST = 0.01;
	
	private Double paymentFee(double amount) {
		return amount * FEE_PERCENTAGE;
	}
	private Double interest(double amount, Integer months) {
		return amount * MONTHLY_INTEREST * months; 
	}

	

}
