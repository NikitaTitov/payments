package dto.payments;

import lombok.Data;

@Data
public class PaymentConfirmRequest {

	private final String transactionId;

	private String amount;
	private JsonData jsonData;

}
