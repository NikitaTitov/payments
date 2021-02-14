package ru.nikita.payments.services;

import dto.payments.PaymentCancelRequest;
import dto.payments.PaymentConfirmRequest;
import dto.payments.PaymentRequest;
import dto.payments.PaymentResponse;

import java.util.Optional;

public interface CloudPaymentService {

	Optional<PaymentResponse> payWithTwoSteps(PaymentRequest request);

	Optional<PaymentResponse> payWithSingleStep(PaymentRequest request);

	Optional<PaymentResponse> confirmPayWithTwoSteps(PaymentConfirmRequest request);

	Optional<PaymentResponse> cancelPay(PaymentCancelRequest request);

	Optional<PaymentResponse> refundPay(PaymentCancelRequest request);

}
