package ru.nikita.payments.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;

@Configuration
@RequiredArgsConstructor
public class CloudPaymentFeignClientConfiguration {

	private final CloudPaymentSettings cloudPaymentSettings;

	@Bean
	public BasicAuthenticationInterceptor basicAuthenticationInterceptor() {
		return new BasicAuthenticationInterceptor(cloudPaymentSettings.getPublicId(), cloudPaymentSettings.getApiKey());
	}
}
