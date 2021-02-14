package dto.payments;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import lombok.Builder;
import lombok.Data;
import utils.CultureName;
import utils.Currency;

@Data
@JsonInclude(Include.NON_NULL)
@Builder(builderClassName = "PaymentRequestBuilder")
public class PaymentRequest {
	private final Integer amount;
	private final String ipAddress;
	private final String cardCryptogramPacket;
	private final String name;


	/**
	 * Валюта: RUB/USD/EUR/GBP
	 *
	 * @see Currency
	 * Если параметр не передан, то по умолчанию принимает значение RUB.
	 */
	private String currency;
	private String paymentUrl;
	private String invoiceId;
	private String description;

	/**
	 * Язык уведомлений. Возможные значения: "ru-RU", "en-US"
	 *
	 * @see CultureName
	 */
	private String cultureName;
	private String accountId;
	private String email;
	private Payer payer;
	private JsonData jsonData;
	private String transactionId;

}
