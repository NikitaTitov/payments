package ru.nikita.auth.models.dto.login;

import lombok.Data;

@Data
public class SapCdcLoginRequest {
	private final String apiKey;
	private final String vToken;
	private final int code;
	private String CID;
	private String include;
	private String regSource;
	private int sessionExpiration;
	private String targetEnv;
	private String format = "json";
	private String callback;
	private String context;
	private boolean httpStatusCodes = false;
}
