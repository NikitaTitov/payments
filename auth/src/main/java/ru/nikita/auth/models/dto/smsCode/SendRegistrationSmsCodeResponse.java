package ru.nikita.auth.models.dto.smsCode;

import lombok.Data;

/**
 * https://developers.gigya.com/display/GD/accounts.otp.sendCode+REST
 */
@Data
public class SendRegistrationSmsCodeResponse {
	private String vToken;
	private String code;
	private int apiVersion;
	private String callId;
	private int errorCode;
	private String errorDetails;
	private String errorMessage;
	private String fullEventName;
	private String time;
}
