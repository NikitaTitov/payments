package ru.nikita.payments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;
import ru.nikita.payments.configuration.CloudPaymentSettings;

@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties(value = {CloudPaymentSettings.class})
public class PaymentsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentsApplication.class, args);
	}

}
