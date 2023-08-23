package services;

public class PaypalService implements OnlinePaymentServices{

	@Override
	public Double paymentFee(Double amount) {
		// 2% de taxa de pagamento
		
		return amount * 0.02;
	}

	@Override
	public Double interest(Double amount, Integer months) {
		// taxa de 1% por parcela
		Double x = (amount * 0.01 * months);
		return x;
	}

	
}
