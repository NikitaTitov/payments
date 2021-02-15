package ru.nikita.payments.services.impl;

import dto.payments.PaymentCancelRequest;
import dto.payments.PaymentConfirmRequest;
import dto.payments.PaymentRequest;
import dto.payments.PaymentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nikita.payments.clients.CloudPaymentClient;
import ru.nikita.payments.services.CloudPaymentService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CloudPaymentServiceImpl implements CloudPaymentService {

	private final CloudPaymentClient cloudPaymentClient;

	@Override
	public Optional<PaymentResponse> payWithTwoSteps(PaymentRequest request) {
		return cloudPaymentClient.payWithTwoSteps(request);
	}

	@Override
	public Optional<PaymentResponse> payWithSingleStep(PaymentRequest request) {
		return cloudPaymentClient.payWithSingleStep(request);
	}

	@Override
	public Optional<PaymentResponse> confirmPayWithTwoSteps(PaymentConfirmRequest request) {
		return cloudPaymentClient.confirmPayWithTwoSteps(request);
	}

	@Override
	public Optional<PaymentResponse> cancelPay(PaymentCancelRequest request) {
		return cloudPaymentClient.cancelPay(request);
	}

	@Override
	public Optional<PaymentResponse> refundPay(PaymentCancelRequest request) {
		return cloudPaymentClient.refundPay(request);
	}
}
