package ru.nikita.payments.configuration;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties("app.cloud-payments")
public class CloudPaymentSettings {

	private String singleStagePayUrl;
	private String doubleStagePayUrl;
	private String publicId;
	private String apiKey;

}
