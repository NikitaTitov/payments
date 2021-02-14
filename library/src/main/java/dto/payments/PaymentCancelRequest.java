package dto.payments;

import lombok.Data;

@Data
public class PaymentCancelRequest {

	private final String transactionId;

	private String amount;
	private JsonData jsonData;

}
