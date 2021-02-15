package ru.nikita.payments.clients;

import dto.payments.PaymentCancelRequest;
import dto.payments.PaymentConfirmRequest;
import dto.payments.PaymentRequest;
import dto.payments.PaymentResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import ru.nikita.payments.configuration.CloudPaymentFeignClientConfiguration;

import java.util.Optional;

@FeignClient(
		name = "cloudPaymentApi",
		url = "https://api.cloudpayments.ru/payments",
		configuration = CloudPaymentFeignClientConfiguration.class
)
public interface CloudPaymentClient {

	@PostMapping("/cards/auth")
	Optional<PaymentResponse> payWithTwoSteps(PaymentRequest request);

	@PostMapping("/cards/charge")
	Optional<PaymentResponse> payWithSingleStep(PaymentRequest request);

	@PostMapping("/confirm")
	Optional<PaymentResponse> confirmPayWithTwoSteps(PaymentConfirmRequest request);

	@PostMapping("/payments/void")
	Optional<PaymentResponse> cancelPay(PaymentCancelRequest request);

	@PostMapping("/payments/refund")
	Optional<PaymentResponse> refundPay(PaymentCancelRequest request);
}
