package ru.nikita.payments.services.impl;

import dto.payments.PaymentCancelRequest;
import dto.payments.PaymentConfirmRequest;
import dto.payments.PaymentRequest;
import dto.payments.PaymentResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.nikita.payments.repositories.CloudPaymentRepository;
import ru.nikita.payments.services.CloudPaymentService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CloudPaymentServiceImpl implements CloudPaymentService {

	private final CloudPaymentRepository cloudPaymentRepository;

	@Override
	public Optional<PaymentResponse> payWithTwoSteps(PaymentRequest request) {
		return cloudPaymentRepository.payWithTwoSteps(request);
	}

	@Override
	public Optional<PaymentResponse> payWithSingleStep(PaymentRequest request) {
		return cloudPaymentRepository.payWithSingleStep(request);
	}

	@Override
	public Optional<PaymentResponse> confirmPayWithTwoSteps(PaymentConfirmRequest request) {
		return cloudPaymentRepository.confirmPayWithTwoSteps(request);
	}

	@Override
	public Optional<PaymentResponse> cancelPay(PaymentCancelRequest request) {
		return cloudPaymentRepository.cancelPay(request);
	}

	@Override
	public Optional<PaymentResponse> refundPay(PaymentCancelRequest request) {
		return cloudPaymentRepository.refundPay(request);
	}
}
