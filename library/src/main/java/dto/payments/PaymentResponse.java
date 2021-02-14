package dto.payments;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {

	private Model model;
	private boolean success;
	private String message;
}
