package ru.nikita.auth.models.dto.finalizeRegistration;

import lombok.Data;

@Data
public class SapCdcFinalizeRegistrationRequest {
	private final String regToken;
}
