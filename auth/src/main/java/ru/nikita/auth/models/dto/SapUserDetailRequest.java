package ru.nikita.auth.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SapUserDetailRequest {

	private String apiKey;
	private String lang;
	/**
	 * Phone number for sending verification code. This parameter or {@link #email} must be sent
	 */
	private String phoneNumber;
	/**
	 * Email for sending verification code. This parameter or {@link #phoneNumber} must be sent
	 */
	private String email;
	private boolean sendCode = true;
	private String format = "json";
	/**
	 * If parameter {@link #format} set as jsoup
	 */
	private String callback;

	/**
	 * By default api answer status is always 200.
	 * If this parameter is set to true, the HTTP status code in API's response would reflect an error,
	 * if one occurred.
	 */
	private boolean httpStatusCodes = false;

	private String regToken;

	private String vToken;
	private int code;
	private String CID;
	private String include;
	private String regSource;
	private int sessionExpiration;
	private String targetEnv;
	private String context;
}
